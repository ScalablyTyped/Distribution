package typings.googletag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the namespace that GPT uses for `adsense`.
  */
object adsense {
  
  /**
    * Attribute name for all [AdSense Attributes](https://developers.google.com/publisher-tag/adsense_attributes).
    *
    * | Attribute name           | Legacy attribute    | Example             | Allowed values                                                                                             |
    * | :----------------------- | :------------------ | :------------------ | :--------------------------------------------------------------------------------------------------------- |
    * | adsense_channel_ids      | google_ad_channel   | 271828183+314159265 | valid AdSense channel IDs, separated by `+`                                                                |
    * | adsense_ad_types         | google_ad_type      | text_image          | text, image, text_image                                                                                    |
    * | adsense_ad_format        | google_ad_format    | 250x250_as          | 160x600_as, 300x250_as, 336x280_as, 728x90_as, ...                                                         |
    * | adsense_background_color | google_color_bg     | #000000             | hexadecimal colors                                                                                         |
    * | adsense_border_color     | google_color_border | #000000             | hexadecimal colors                                                                                         |
    * | adsense_link_color       | google_color_link   | #000000             | hexadecimal colors                                                                                         |
    * | adsense_test_mode        | N/A                 | on                  | on                                                                                                         |
    * | adsense_text_color       | google_color_text   | #000000             | hexadecimal colors                                                                                         |
    * | adsense_url_color        | google_color_url    | #000000             | hexadecimal colors                                                                                         |
    * | adsense_ui_features      | google_ui_features  | rc:10               | `rc:10` for very rounded corners, `rc:6` for slightly rounded corners, `rc:0` for square corners (default) |
    * | page_url                 | N/A                 | www.mysite.com      | valid URLs                                                                                                 |
    */
  /* Rewritten from type alias, can be one of: 
    - typings.googletag.googletagStrings.adsense_channel_ids
    - typings.googletag.googletagStrings.adsense_ad_types
    - typings.googletag.googletagStrings.adsense_ad_format
    - typings.googletag.googletagStrings.adsense_background_color
    - typings.googletag.googletagStrings.adsense_border_color
    - typings.googletag.googletagStrings.adsense_link_color
    - typings.googletag.googletagStrings.adsense_test_mode
    - typings.googletag.googletagStrings.adsense_text_color
    - typings.googletag.googletagStrings.adsense_url_color
    - typings.googletag.googletagStrings.adsense_ui_features
    - typings.googletag.googletagStrings.page_url
  */
  trait AttributeName extends StObject
  object AttributeName {
    
    inline def adsense_ad_format: typings.googletag.googletagStrings.adsense_ad_format = "adsense_ad_format".asInstanceOf[typings.googletag.googletagStrings.adsense_ad_format]
    
    inline def adsense_ad_types: typings.googletag.googletagStrings.adsense_ad_types = "adsense_ad_types".asInstanceOf[typings.googletag.googletagStrings.adsense_ad_types]
    
    inline def adsense_background_color: typings.googletag.googletagStrings.adsense_background_color = "adsense_background_color".asInstanceOf[typings.googletag.googletagStrings.adsense_background_color]
    
    inline def adsense_border_color: typings.googletag.googletagStrings.adsense_border_color = "adsense_border_color".asInstanceOf[typings.googletag.googletagStrings.adsense_border_color]
    
    inline def adsense_channel_ids: typings.googletag.googletagStrings.adsense_channel_ids = "adsense_channel_ids".asInstanceOf[typings.googletag.googletagStrings.adsense_channel_ids]
    
    inline def adsense_link_color: typings.googletag.googletagStrings.adsense_link_color = "adsense_link_color".asInstanceOf[typings.googletag.googletagStrings.adsense_link_color]
    
    inline def adsense_test_mode: typings.googletag.googletagStrings.adsense_test_mode = "adsense_test_mode".asInstanceOf[typings.googletag.googletagStrings.adsense_test_mode]
    
    inline def adsense_text_color: typings.googletag.googletagStrings.adsense_text_color = "adsense_text_color".asInstanceOf[typings.googletag.googletagStrings.adsense_text_color]
    
    inline def adsense_ui_features: typings.googletag.googletagStrings.adsense_ui_features = "adsense_ui_features".asInstanceOf[typings.googletag.googletagStrings.adsense_ui_features]
    
    inline def adsense_url_color: typings.googletag.googletagStrings.adsense_url_color = "adsense_url_color".asInstanceOf[typings.googletag.googletagStrings.adsense_url_color]
    
    inline def page_url: typings.googletag.googletagStrings.page_url = "page_url".asInstanceOf[typings.googletag.googletagStrings.page_url]
  }
}
