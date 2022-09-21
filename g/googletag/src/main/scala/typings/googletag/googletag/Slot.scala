package typings.googletag.googletag

import typings.googletag.googletag.adsense.AttributeName
import typings.googletag.googletag.config.SlotSettingsConfig
import typings.googletag.googletagStrings.fluid
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Slot is an object representing single ad slot on a page.
  */
@js.native
trait Slot extends StObject {
  
  /**
    * Adds a {@link Service} to this slot.
    *
    * **Example**
    * ```
    * googletag.defineSlot('/1234567/sports', [160, 600])
    *          .addService(googletag.pubads());
    * ```
    *
    * **See also**
    * - [Get Started with Google Publisher Tags](https://developers.google.com/publisher-tag/guides/get-started)
    * - [Display a test ad](https://developers.google.com/publisher-tag/samples/display-test-ad)
    *
    * @param service The service to be added.
    * @returns The slot object on which the method was called.
    */
  def addService(service: Service): Slot = js.native
  
  /**
    * Clears all slot-level ad category exclusion labels for this slot.
    *
    * **Example**
    * ```
    * // Set category exclusion to exclude ads with 'AirlineAd' labels.
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .setCategoryExclusion('AirlineAd')
    *                     .addService(googletag.pubads());
    * // Make an ad request. No ad with 'AirlineAd' label will be returned
    * // for the slot.
    * // Clear category exclusions so all ads can be returned.
    * slot.clearCategoryExclusions();
    * // Make an ad request. Any ad can be returned for the slot.
    * ```
    *
    * @returns The slot object on which the method was called.
    */
  def clearCategoryExclusions(): Slot = js.native
  
  /**
    * Clears specific or all custom slot-level targeting parameters for this slot.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .setTargeting('allow_expandable', 'true')
    *                     .setTargeting('interests', ['sports', 'music'])
    *                     .setTargeting('color', 'red')
    *                     .addService(googletag.pubads());
    * slot.clearTargeting('color');
    * // Targeting 'allow_expandable' and 'interests' are still present,
    * // while 'color' was cleared.
    * slot.clearTargeting();
    * // All targeting has been cleared.
    * ```
    *
    * **See also**
    * - [Key-value targeting](https://developers.google.com/publisher-tag/guides/key-value-targeting)
    *
    * @param key Targeting parameter key. The key is optional; all targeting parameters will be cleared if it is unspecified.
    * @returns The slot object on which the method was called.
    */
  def clearTargeting(): Slot = js.native
  def clearTargeting(key: String): Slot = js.native
  
  /**
    * Sets an array of mappings from a minimum viewport size to slot size for this slot.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .addService(googletag.pubads());
    * var mapping = googletag.sizeMapping()
    *                        .addSize([100, 100], [88, 31])
    *                        .addSize([320, 400], [[320, 50], [300, 50]])
    *                        .build();
    * slot.defineSizeMapping(mapping);
    * ```
    *
    * **See also**
    * - [Ad sizes: Responsive ads](https://developers.google.com/publisher-tag/guides/ad-sizes#responsive_ads)
    *
    * @param sizeMapping Array of size mappings.
    * You can use {@link googletag.SizeMappingBuilder} to create it.
    * Each size mapping is an array of two elements: {@link googletag.SingleSizeArray} and {@link googletag.GeneralSize}.
    * @returns The slot object on which the method was called.
    */
  def defineSizeMapping(sizeMapping: SizeMappingArray): Slot = js.native
  
  /**
    * Returns the value for the AdSense attribute associated with the given key for this slot.
    * To see service-level attributes inherited by this slot, use {@link PubAdsService.get googletag.pubads().get()}.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .set('adsense_background_color', '#FFFFFF')
    *                     .addService(googletag.pubads());
    * var color = slot.get('adsense_background_color');
    * // color == '#FFFFFF'.
    * ```
    *
    * **See also**
    * - [AdSense Attributes](https://developers.google.com/publisher-tag/adsense_attributes)
    *
    * @param key Name of the attribute to look for.
    * @returns Current value for the attribute key, or `null` if the key is not present.
    */
  def get(key: AttributeName): String | Null = js.native
  
  /**
    * Returns the full path of the ad unit, with the network code and ad unit path.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .addService(googletag.pubads());
    * var path = slot.getAdUnitPath();
    * // path is '/1234567/sports'
    * ```
    *
    * @returns Ad unit path.
    */
  def getAdUnitPath(): String = js.native
  
  /**
    * Returns the list of attribute keys set on this slot.
    * To see the keys of service-level attributes inherited by this slot, use {@link PubAdsService.getAttributeKeys googletag.pubads().getAttributeKeys()}.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .set('adsense_background_color', '#FFFFFF')
    *                     .set('adsense_border_color', '#AABBCC')
    *                     .addService(googletag.pubads());
    * var keys = slot.getAttributeKeys();
    * // Keys are ['adsense_background_color', 'adsense_border_color'].
    * ```
    *
    * @returns Array of attribute keys. Ordering is undefined.
    */
  def getAttributeKeys(): js.Array[String] = js.native
  
  /**
    * Returns the ad category exclusion labels for this slot.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .setCategoryExclusion('AirlineAd')
    *                     .setCategoryExclusion('TrainAd')
    *                     .addService(googletag.pubads());
    * var exclusions = slot.getCategoryExclusions();
    * // exclusions are ['AirlineAd', 'TrainAd']
    * ```
    *
    * @returns The ad category exclusion labels for this slot, or an empty array if none have been set.
    */
  def getCategoryExclusions(): js.Array[String] = js.native
  
  def getClickUrl(): String = js.native
  
  def getCollapseEmptyDiv(): Boolean | Null = js.native
  
  def getContentUrl(): String = js.native
  
  def getDivStartsCollapsed(): Boolean | Null = js.native
  
  def getEscapedQemQueryId(): String = js.native
  
  def getHtml(): String = js.native
  
  /**
    * Whether or not constructs an out-of-page ad slot with {@link defineOutOfPageSlot}.
    */
  def getOutOfPage(): Boolean = js.native
  
  /**
    * Returns the ad response information. This is based on the last ad response for the slot. If this is called when the slot has no ad, `null` will be returned.
    * @returns The latest ad response information, or `null` if the slot has no ad.
    */
  def getResponseInformation(): ResponseInformation | Null = js.native
  
  def getServices(): js.Array[Service] = js.native
  
  def getSizes(): js.Array[Size | fluid] = js.native
  
  /**
    * Returns the ID of the slot `div` provided when the slot was defined.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .addService(googletag.pubads());
    * var slotElementId = slot.getSlotElementId();
    * // slotElementId is 'div-1'
    * ```
    *
    * @returns Slot element id.
    */
  def getSlotElementId(): String = js.native
  
  def getSlotId(): SlotId = js.native
  
  /**
    * Returns a specific custom targeting parameter set on this slot. Service-level targeting parameters are not included.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .setTargeting('allow_expandable', 'true')
    *                     .addService(googletag.pubads());
    * var param = slot.getTargeting('allow_expandable');
    * // param is ['true']
    * var param = slot.getTargeting('age');
    * // param is [] (empty array)
    * ```
    *
    * @param key The targeting key to look for.
    * @returns The values associated with this key, or an empty array if there is no such key.
    */
  def getTargeting(key: String): js.Array[String] = js.native
  
  /**
    * Returns the list of all custom targeting keys set on this slot. Service-level targeting keys are not included.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .setTargeting('allow_expandable', 'true')
    *                     .setTargeting('interests', ['sports', 'music'])
    *                     .addService(googletag.pubads());
    * var keys = slot.getTargetingKeys();
    * // keys are ['interests', 'allow_expandable'].
    * ```
    *
    * @returns Array of targeting keys. Ordering is undefined.
    */
  def getTargetingKeys(): js.Array[String] = js.native
  
  def getTargetingMap(): Record[String, String | js.Array[String]] = js.native
  
  /**
    * Sets a value for an AdSense attribute on this ad slot.
    * This will override any values set at the service level for this key.
    *
    * Calling this method more than once for the same key will override previously set values for that key.
    * All values must be set before calling `display` or `refresh`.
    *
    * **Example**
    * ```
    * // Setting an attribute on a single ad slot.
    * googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *          .set('adsense_background_color', '#FFFFFF')
    *          .addService(googletag.pubads());
    * ```
    *
    * **See also**
    * - [AdSense Attributes](https://developers.google.com/publisher-tag/adsense_attributes)
    *
    * @param key The name of the attribute.
    * @param value Attribute value.
    * @returns The slot object on which the method was called.
    */
  def set(key: AttributeName, value: String): Slot = js.native
  
  /**
    * Sets a slot-level ad category exclusion label on this slot.
    *
    * **Example**
    * ```
    * // Label = AirlineAd
    * googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *          .setCategoryExclusion('AirlineAd')
    *          .addService(googletag.pubads());
    * ```
    *
    * @param categoryExclusion The ad category exclusion label to add.
    * @returns The slot object on which the method was called.
    */
  def setCategoryExclusion(categoryExclusion: String): Slot = js.native
  
  /**
    * Sets the click URL to which users will be redirected after clicking on the ad.
    *
    * The Google Ad Manager servers still record a click even if the click URL is replaced.
    * Any landing page URL associated with the creative that is served is appended to the provided value.
    * Subsequent calls overwrite the value. This works only for non-SRA requests.
    *
    * **Example**
    * ```
    * googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *          .setClickUrl('http://www.example.com?original_click_url=')
    *          .addService(googletag.pubads());
    * ```
    *
    * @param value The click URL to set.
    * @returns The slot object on which the method was called.
    */
  def setClickUrl(value: String): Slot = js.native
  
  /**
    * Sets whether the slot `div` should be hidden when there is no ad in the slot. This overrides the service-level settings.
    *
    * **Example**
    * ```
    * googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *          .setCollapseEmptyDiv(true, true)
    *          .addService(googletag.pubads());
    * // The above will cause the div for this slot to be collapsed
    * // when the page is loaded, before ads are requested.
    * googletag.defineSlot('/1234567/sports', [160, 600], 'div-2')
    *          .setCollapseEmptyDiv(true)
    *          .addService(googletag.pubads());
    * // The above will cause the div for this slot to be collapsed
    * // only after GPT detects that no ads are available for the slot.
    * ```
    *
    * **See also**
    * - [Collapse empty ad slots](https://developers.google.com/publisher-tag/samples/collapse-empty-ad-slots)
    * - [Minimize layout shift](https://developers.google.com/publisher-tag/guides/minimize-layout-shift)
    *
    * @param collapse Whether to collapse the slot if no ad is returned.
    * @param collapseBeforeAdFetch Whether to collapse the slot even before an ad is fetched. Ignored if collapse is not `true`.
    * @returns The slot object on which the method was called.
    */
  def setCollapseEmptyDiv(collapse: Boolean): Slot = js.native
  def setCollapseEmptyDiv(collapse: Boolean, collapseBeforeAdFetch: Boolean): Slot = js.native
  
  /**
    * Sets general configuration options for this slot.
    * @param slotConfig The configuration object.
    */
  def setConfig(slotConfig: SlotSettingsConfig): Unit = js.native
  
  /**
    * Configures whether ads in this slot should be forced to be rendered using a SafeFrame container.
    *
    * Please keep the following things in mind while using this API:
    * - This setting will only take effect for **subsequent** ad requests made for the respective slots.
    * - The slot level setting, if specified, will always override the page level setting.
    * - If set to `true` (at slot-level or page level), the ad will always be rendered using a SafeFrame container independent of the choice made in the Google Ad Manager UI.
    * - However, if set to `false` or left unspecified, the ad will be rendered using a SafeFrame container depending on the type of creative and the selection made in the Google Ad Manager UI.
    * - This API should be used with caution as it could impact the behaviour of creatives that attempt to break out of their iFrames or rely on them being rendered directly in a publishers page.
    *
    * **Example**
    * ```
    * googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *          .setForceSafeFrame(true)
    *          .addService(googletag.pubads());
    * ```
    *
    * **See also**
    * - [Render creatives using SafeFrame](https://support.google.com/admanager/answer/6023110)
    *
    * @param forceSafeFrame `true` to force all ads in this slot to be rendered in SafeFrames and `false` to opt-out of a page-level setting (if present).
    * Setting this to `false` when not specified at the page-level won't change anything.
    * @returns The slot object on which the method was called.
    */
  def setForceSafeFrame(forceSafeFrame: Boolean): Slot = js.native
  
  /**
    * Sets the slot-level preferences for SafeFrame configuration.
    * Any unrecognized keys in the config object will be ignored.
    * The entire config will be ignored if an invalid value is passed for a recognized key.
    *
    * These slot-level preferences, if specified, will override any page-level preferences.
    *
    * **Example**
    * ```
    * googletag.pubads().setForceSafeFrame(true);
    * // The following slot will have a sandboxed safeframe that only
    * // disallows top-level navigation.
    * googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *          .setSafeFrameConfig({sandbox: true})
    *          .addService(googletag.pubads());
    * // The following slot will inherit page-level settings.
    * googletag.defineSlot('/1234567/news', [160, 600], 'div-2')
    *          .addService(googletag.pubads());
    * googletag.display('div-1');
    * googletag.display('div-2');
    * ```
    *
    * **See also**
    * - [Render creatives using SafeFrame](https://support.google.com/admanager/answer/6023110)
    *
    * @param config The configuration object.
    * @returns The slot object on which the method was called.
    */
  def setSafeFrameConfig(config: SafeFrameConfig): Slot = js.native
  
  /**
    * Sets a custom targeting parameter for this slot.
    * Calling this method multiple times for the same key will overwrite old values.
    * Values set here will overwrite targeting parameters set at the service-level.
    * These keys are defined in your Google Ad Manager account.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600], 'div-1')
    *                     .addService(googletag.pubads());
    * // Example with a single value for a key.
    * slot.setTargeting('allow_expandable', 'true');
    * // Example with multiple values for a key inside in an array.
    * slot.setTargeting('interests', ['sports', 'music']);
    * ```
    *
    * **See also**
    * - [Key-value targeting](https://developers.google.com/publisher-tag/guides/key-value-targeting)
    *
    * @param key Targeting parameter key.
    * @param value Targeting parameter value or array of values.
    * @returns The slot object on which the method was called.
    */
  def setTargeting(key: String, value: String): Slot = js.native
  def setTargeting(key: String, value: js.Array[String]): Slot = js.native
  
  /**
    * Sets custom targeting parameters for this slot, from a key:value map in a JSON object.
    * This is the same as calling {@link setTargeting setTargeting(key,value)} for all the key values of the object.
    * These keys are defined in your Google Ad Manager account.
    *
    * **Notes:**
    * - In case of overwriting, only the last value will be kept.
    * - If the value is an array, any previous value will be overwritten, not merged.
    * - Values set here will overwrite targeting parameters set at the service-level.
    *
    * **Example**
    * ```
    * var slot = googletag.defineSlot('/1234567/sports', [160, 600],
    *                                 'div-1');
    * slot.updateTargetingFromMap({
    *   'color': 'red',
    *   'interests': ['sports','music','movies']
    * });
    * ```
    * @param map Targeting parameter key:value map.
    * @returns The slot object on which the method was called.
    */
  def updateTargetingFromMap(map: Record[String, String | js.Array[String]]): Slot = js.native
}
