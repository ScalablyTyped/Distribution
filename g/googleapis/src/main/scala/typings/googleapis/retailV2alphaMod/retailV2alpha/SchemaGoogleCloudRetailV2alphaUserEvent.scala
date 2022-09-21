package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaUserEvent extends StObject {
  
  /**
    * Extra user event features to include in the recommendation model. If you provide custom attributes for ingested user events, also include them in the user events that you associate with prediction requests. Custom attribute formatting must be consistent between imported events and events provided with prediction requests. This lets the Retail API use those custom attributes when training models and serving predictions, which helps improve recommendation quality. This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT error is returned: * The key must be a UTF-8 encoded string with a length limit of 5,000 characters. * For text attributes, at most 400 values are allowed. Empty values are not allowed. Each value must be a UTF-8 encoded string with a length limit of 256 characters. * For number attributes, at most 400 values are allowed. For product recommendations, an example of extra user information is traffic_channel, which is how a user arrives at the site. Users can arrive at the site by coming to the site directly, coming through Google search, or in other ways.
    */
  var attributes: js.UndefOr[StringDictionary[SchemaGoogleCloudRetailV2alphaCustomAttribute] | Null] = js.undefined
  
  /**
    * Highly recommended for user events that are the result of PredictionService.Predict. This field enables accurate attribution of recommendation model performance. The value must be a valid PredictResponse.attribution_token for user events that are the result of PredictionService.Predict. The value must be a valid SearchResponse.attribution_token for user events that are the result of SearchService.Search. This token enables us to accurately attribute page view or purchase back to the event and the particular predict response containing this clicked/purchased product. If user clicks on product K in the recommendation results, pass PredictResponse.attribution_token as a URL parameter to product K's page. When recording events on product K's page, log the PredictResponse.attribution_token to this field.
    */
  var attributionToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID or name of the associated shopping cart. This ID is used to associate multiple items added or present in the cart before purchase. This can only be set for `add-to-cart`, `purchase-complete`, or `shopping-cart-page-view` events.
    */
  var cartId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The main auto-completion details related to the event. This field should be set for `search` event when autocomplete function is enabled and the user clicks a suggestion for search.
    */
  var completionDetail: js.UndefOr[SchemaGoogleCloudRetailV2alphaCompletionDetail] = js.undefined
  
  /**
    * Only required for UserEventService.ImportUserEvents method. Timestamp of when the user event happened.
    */
  var eventTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. User event type. Allowed values are: * `add-to-cart`: Products being added to cart. * `category-page-view`: Special pages such as sale or promotion pages viewed. * `detail-page-view`: Products detail page viewed. * `home-page-view`: Homepage viewed. * `promotion-offered`: Promotion is offered to a user. * `promotion-not-offered`: Promotion is not offered to a user. * `purchase-complete`: User finishing a purchase. * `search`: Product search. * `shopping-cart-page-view`: User viewing a shopping cart.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of identifiers for the independent experiment groups this user event belongs to. This is used to distinguish between user events associated with different experiment setups (e.g. using Retail API, using different recommendation models).
    */
  var experimentIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The filter syntax consists of an expression language for constructing a predicate from one or more fields of the products being filtered. See SearchRequest.filter for definition and syntax. The value must be a UTF-8 encoded string with a length limit of 1,000 characters. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An integer that specifies the current offset for pagination (the 0-indexed starting location, amongst the products deemed by the API as relevant). See SearchRequest.offset for definition. If this field is negative, an INVALID_ARGUMENT is returned. This can only be set for `search` events. Other event types should not set this field. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var offset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The order in which products are returned. See SearchRequest.order_by for definition and syntax. The value must be a UTF-8 encoded string with a length limit of 1,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. This can only be set for `search` events. Other event types should not set this field. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var orderBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The categories associated with a category page. To represent full path of category, use '\>' sign to separate different hierarchies. If '\>' is part of the category name, please replace it with other character(s). Category pages include special pages such as sales or promotions. For instance, a special sale page may have the category hierarchy: "pageCategories" : ["Sales \> 2017 Black Friday Deals"]. Required for `category-page-view` events. At least one of search_query or page_categories is required for `search` events. Other event types should not set this field. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var pageCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A unique ID of a web page view. This should be kept the same for all user events triggered from the same pageview. For example, an item detail page view could trigger multiple events as the user is browsing the page. The `pageViewId` property should be kept the same for all these events so that they can be grouped together properly. When using the client side event reporting with JavaScript pixel and Google Tag Manager, this value is filled in automatically.
    */
  var pageViewId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The main product details related to the event. This field is optional except for the following event types: * `add-to-cart` * `detail-page-view` * `purchase-complete` In a `search` event, this field represents the products returned to the end user on the current page (the end user may have not finished browsing the whole page yet). When a new page is returned to the end user, after pagination/filtering/ordering even for the same query, a new `search` event with different product_details is desired. The end user may have not finished browsing the whole page yet.
    */
  var productDetails: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaProductDetail]] = js.undefined
  
  /**
    * A transaction represents the entire purchase transaction. Required for `purchase-complete` events. Other event types should not set this field. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var purchaseTransaction: js.UndefOr[SchemaGoogleCloudRetailV2alphaPurchaseTransaction] = js.undefined
  
  /**
    * The referrer URL of the current page. When using the client side event reporting with JavaScript pixel and Google Tag Manager, this value is filled in automatically.
    */
  var referrerUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user's search query. See SearchRequest.query for definition. The value must be a UTF-8 encoded string with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. At least one of search_query or page_categories is required for `search` events. Other event types should not set this field. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var searchQuery: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique identifier for tracking a visitor session with a length limit of 128 bytes. A session is an aggregation of an end user behavior in a time span. A general guideline to populate the sesion_id: 1. If user has no activity for 30 min, a new session_id should be assigned. 2. The session_id should be unique across users, suggest use uuid or add visitor_id as prefix.
    */
  var sessionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Complete URL (window.location.href) of the user's current page. When using the client side event reporting with JavaScript pixel and Google Tag Manager, this value is filled in automatically. Maximum length 5,000 characters.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User information.
    */
  var userInfo: js.UndefOr[SchemaGoogleCloudRetailV2alphaUserInfo] = js.undefined
  
  /**
    * Required. A unique identifier for tracking visitors. For example, this could be implemented with an HTTP cookie, which should be able to uniquely identify a visitor on a single device. This unique identifier should not change if the visitor log in/out of the website. Don't set the field to the same fixed ID for different users. This mixes the event history of those users together, which results in degraded model quality. The field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. The field should not contain PII or user-data. We recommend to use Google Analytics [Client ID](https://developers.google.com/analytics/devguides/collection/analyticsjs/field-reference#clientId) for this field.
    */
  var visitorId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaUserEvent {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaUserEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaUserEvent]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaUserEvent](x: Self) {
    
    inline def setAttributes(value: StringDictionary[SchemaGoogleCloudRetailV2alphaCustomAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributionToken(value: String): Self = StObject.set(x, "attributionToken", value.asInstanceOf[js.Any])
    
    inline def setAttributionTokenNull: Self = StObject.set(x, "attributionToken", null)
    
    inline def setAttributionTokenUndefined: Self = StObject.set(x, "attributionToken", js.undefined)
    
    inline def setCartId(value: String): Self = StObject.set(x, "cartId", value.asInstanceOf[js.Any])
    
    inline def setCartIdNull: Self = StObject.set(x, "cartId", null)
    
    inline def setCartIdUndefined: Self = StObject.set(x, "cartId", js.undefined)
    
    inline def setCompletionDetail(value: SchemaGoogleCloudRetailV2alphaCompletionDetail): Self = StObject.set(x, "completionDetail", value.asInstanceOf[js.Any])
    
    inline def setCompletionDetailUndefined: Self = StObject.set(x, "completionDetail", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeNull: Self = StObject.set(x, "eventTime", null)
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setExperimentIds(value: js.Array[String]): Self = StObject.set(x, "experimentIds", value.asInstanceOf[js.Any])
    
    inline def setExperimentIdsNull: Self = StObject.set(x, "experimentIds", null)
    
    inline def setExperimentIdsUndefined: Self = StObject.set(x, "experimentIds", js.undefined)
    
    inline def setExperimentIdsVarargs(value: String*): Self = StObject.set(x, "experimentIds", js.Array(value*))
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageCategories(value: js.Array[String]): Self = StObject.set(x, "pageCategories", value.asInstanceOf[js.Any])
    
    inline def setPageCategoriesNull: Self = StObject.set(x, "pageCategories", null)
    
    inline def setPageCategoriesUndefined: Self = StObject.set(x, "pageCategories", js.undefined)
    
    inline def setPageCategoriesVarargs(value: String*): Self = StObject.set(x, "pageCategories", js.Array(value*))
    
    inline def setPageViewId(value: String): Self = StObject.set(x, "pageViewId", value.asInstanceOf[js.Any])
    
    inline def setPageViewIdNull: Self = StObject.set(x, "pageViewId", null)
    
    inline def setPageViewIdUndefined: Self = StObject.set(x, "pageViewId", js.undefined)
    
    inline def setProductDetails(value: js.Array[SchemaGoogleCloudRetailV2alphaProductDetail]): Self = StObject.set(x, "productDetails", value.asInstanceOf[js.Any])
    
    inline def setProductDetailsUndefined: Self = StObject.set(x, "productDetails", js.undefined)
    
    inline def setProductDetailsVarargs(value: SchemaGoogleCloudRetailV2alphaProductDetail*): Self = StObject.set(x, "productDetails", js.Array(value*))
    
    inline def setPurchaseTransaction(value: SchemaGoogleCloudRetailV2alphaPurchaseTransaction): Self = StObject.set(x, "purchaseTransaction", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTransactionUndefined: Self = StObject.set(x, "purchaseTransaction", js.undefined)
    
    inline def setReferrerUri(value: String): Self = StObject.set(x, "referrerUri", value.asInstanceOf[js.Any])
    
    inline def setReferrerUriNull: Self = StObject.set(x, "referrerUri", null)
    
    inline def setReferrerUriUndefined: Self = StObject.set(x, "referrerUri", js.undefined)
    
    inline def setSearchQuery(value: String): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
    
    inline def setSearchQueryNull: Self = StObject.set(x, "searchQuery", null)
    
    inline def setSearchQueryUndefined: Self = StObject.set(x, "searchQuery", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUserInfo(value: SchemaGoogleCloudRetailV2alphaUserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    
    inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    inline def setVisitorIdNull: Self = StObject.set(x, "visitorId", null)
    
    inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
