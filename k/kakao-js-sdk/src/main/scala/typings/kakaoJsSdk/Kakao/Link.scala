package typings.kakaoJsSdk.Kakao

import org.scalablytyped.runtime.StringDictionary
import typings.kakaoJsSdk.anon.Contenttype
import typings.kakaoJsSdk.kakaoJsSdkStrings.commerce
import typings.kakaoJsSdk.kakaoJsSdkStrings.feed
import typings.kakaoJsSdk.kakaoJsSdkStrings.list
import typings.kakaoJsSdk.kakaoJsSdkStrings.location
import typings.kakaoJsSdk.kakaoJsSdkStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  trait BaseObject[ObjectType /* <: String */] extends StObject {
    
    var buttonTitle: js.UndefOr[String] = js.undefined
    
    var buttons: js.UndefOr[js.Array[ButtonObject]] = js.undefined
    
    // default false
    var callback: js.UndefOr[LinkCallback] = js.undefined
    
    var installTalk: js.UndefOr[Boolean] = js.undefined
    
    var objectType: ObjectType
    
    var serverCallbackArgs: js.UndefOr[StringDictionary[Any] | String] = js.undefined
  }
  object BaseObject {
    
    inline def apply[ObjectType /* <: String */](objectType: ObjectType): BaseObject[ObjectType] = {
      val __obj = js.Dynamic.literal(objectType = objectType.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseObject[ObjectType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseObject[?], ObjectType /* <: String */] (val x: Self & BaseObject[ObjectType]) extends AnyVal {
      
      inline def setButtonTitle(value: String): Self = StObject.set(x, "buttonTitle", value.asInstanceOf[js.Any])
      
      inline def setButtonTitleUndefined: Self = StObject.set(x, "buttonTitle", js.undefined)
      
      inline def setButtons(value: js.Array[ButtonObject]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: ButtonObject*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setCallback(value: LinkCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setInstallTalk(value: Boolean): Self = StObject.set(x, "installTalk", value.asInstanceOf[js.Any])
      
      inline def setInstallTalkUndefined: Self = StObject.set(x, "installTalk", js.undefined)
      
      inline def setObjectType(value: ObjectType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
      
      inline def setServerCallbackArgs(value: StringDictionary[Any] | String): Self = StObject.set(x, "serverCallbackArgs", value.asInstanceOf[js.Any])
      
      inline def setServerCallbackArgsUndefined: Self = StObject.set(x, "serverCallbackArgs", js.undefined)
    }
  }
  
  trait ButtonObject extends StObject {
    
    var link: LinkObject
    
    var title: String
  }
  object ButtonObject {
    
    inline def apply(link: LinkObject, title: String): ButtonObject = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonObject] (val x: Self) extends AnyVal {
      
      inline def setLink(value: LinkObject): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommerceObject extends StObject {
    
    var discountPrice: js.UndefOr[Double] = js.undefined
    
    var discountRate: js.UndefOr[Double] = js.undefined
    
    var fixedDiscountPrice: js.UndefOr[Double] = js.undefined
    
    var productName: js.UndefOr[String] = js.undefined
    
    var regularPrice: Double
  }
  object CommerceObject {
    
    inline def apply(regularPrice: Double): CommerceObject = {
      val __obj = js.Dynamic.literal(regularPrice = regularPrice.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommerceObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommerceObject] (val x: Self) extends AnyVal {
      
      inline def setDiscountPrice(value: Double): Self = StObject.set(x, "discountPrice", value.asInstanceOf[js.Any])
      
      inline def setDiscountPriceUndefined: Self = StObject.set(x, "discountPrice", js.undefined)
      
      inline def setDiscountRate(value: Double): Self = StObject.set(x, "discountRate", value.asInstanceOf[js.Any])
      
      inline def setDiscountRateUndefined: Self = StObject.set(x, "discountRate", js.undefined)
      
      inline def setFixedDiscountPrice(value: Double): Self = StObject.set(x, "fixedDiscountPrice", value.asInstanceOf[js.Any])
      
      inline def setFixedDiscountPriceUndefined: Self = StObject.set(x, "fixedDiscountPrice", js.undefined)
      
      inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
      
      inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
      
      inline def setRegularPrice(value: Double): Self = StObject.set(x, "regularPrice", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentObject extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var imageHeight: js.UndefOr[Double] = js.undefined
    
    var imageUrl: String
    
    var imageWidth: js.UndefOr[Double] = js.undefined
    
    var link: LinkObject
    
    var title: String
  }
  object ContentObject {
    
    inline def apply(imageUrl: String, link: LinkObject, title: String): ContentObject = {
      val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentObject] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
      
      inline def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
      
      inline def setImageWidthUndefined: Self = StObject.set(x, "imageWidth", js.undefined)
      
      inline def setLink(value: LinkObject): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultCommerceSettings
    extends StObject
       with BaseObject[commerce]
       with DefaultSettings {
    
    var commerce: CommerceObject
    
    var content: ContentObject
  }
  object DefaultCommerceSettings {
    
    inline def apply(commerce: CommerceObject, content: ContentObject): DefaultCommerceSettings = {
      val __obj = js.Dynamic.literal(commerce = commerce.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], objectType = "commerce")
      __obj.asInstanceOf[DefaultCommerceSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultCommerceSettings] (val x: Self) extends AnyVal {
      
      inline def setCommerce(value: CommerceObject): Self = StObject.set(x, "commerce", value.asInstanceOf[js.Any])
      
      inline def setContent(value: ContentObject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultFeedSettings
    extends StObject
       with BaseObject[feed]
       with DefaultSettings {
    
    var content: ContentObject
    
    var social: js.UndefOr[SocialObject] = js.undefined
  }
  object DefaultFeedSettings {
    
    inline def apply(content: ContentObject): DefaultFeedSettings = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], objectType = "feed")
      __obj.asInstanceOf[DefaultFeedSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultFeedSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(value: ContentObject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setSocial(value: SocialObject): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
      
      inline def setSocialUndefined: Self = StObject.set(x, "social", js.undefined)
    }
  }
  
  trait DefaultListSettings
    extends StObject
       with BaseObject[list]
       with DefaultSettings {
    
    var contents: js.Array[ContentObject]
    
    var headerLink: LinkObject
    
    var headerTitle: String
  }
  object DefaultListSettings {
    
    inline def apply(contents: js.Array[ContentObject], headerLink: LinkObject, headerTitle: String): DefaultListSettings = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], headerLink = headerLink.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], objectType = "list")
      __obj.asInstanceOf[DefaultListSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultListSettings] (val x: Self) extends AnyVal {
      
      inline def setContents(value: js.Array[ContentObject]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsVarargs(value: ContentObject*): Self = StObject.set(x, "contents", js.Array(value*))
      
      inline def setHeaderLink(value: LinkObject): Self = StObject.set(x, "headerLink", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitle(value: String): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultLocationSettings
    extends StObject
       with BaseObject[location]
       with DefaultSettings {
    
    var address: String
    
    var addressTitle: js.UndefOr[String] = js.undefined
    
    var content: ContentObject
    
    var social: js.UndefOr[SocialObject] = js.undefined
  }
  object DefaultLocationSettings {
    
    inline def apply(address: String, content: ContentObject): DefaultLocationSettings = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], objectType = "location")
      __obj.asInstanceOf[DefaultLocationSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultLocationSettings] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressTitle(value: String): Self = StObject.set(x, "addressTitle", value.asInstanceOf[js.Any])
      
      inline def setAddressTitleUndefined: Self = StObject.set(x, "addressTitle", js.undefined)
      
      inline def setContent(value: ContentObject): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setSocial(value: SocialObject): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
      
      inline def setSocialUndefined: Self = StObject.set(x, "social", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.kakaoJsSdk.Kakao.Link.DefaultFeedSettings
    - typings.kakaoJsSdk.Kakao.Link.DefaultListSettings
    - typings.kakaoJsSdk.Kakao.Link.DefaultLocationSettings
    - typings.kakaoJsSdk.Kakao.Link.DefaultCommerceSettings
    - typings.kakaoJsSdk.Kakao.Link.DefaultTextSettings
  */
  trait DefaultSettings extends StObject
  object DefaultSettings {
    
    inline def DefaultCommerceSettings(commerce: CommerceObject, content: ContentObject): typings.kakaoJsSdk.Kakao.Link.DefaultCommerceSettings = {
      val __obj = js.Dynamic.literal(commerce = commerce.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], objectType = "commerce")
      __obj.asInstanceOf[typings.kakaoJsSdk.Kakao.Link.DefaultCommerceSettings]
    }
    
    inline def DefaultFeedSettings(content: ContentObject): typings.kakaoJsSdk.Kakao.Link.DefaultFeedSettings = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], objectType = "feed")
      __obj.asInstanceOf[typings.kakaoJsSdk.Kakao.Link.DefaultFeedSettings]
    }
    
    inline def DefaultListSettings(contents: js.Array[ContentObject], headerLink: LinkObject, headerTitle: String): typings.kakaoJsSdk.Kakao.Link.DefaultListSettings = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], headerLink = headerLink.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], objectType = "list")
      __obj.asInstanceOf[typings.kakaoJsSdk.Kakao.Link.DefaultListSettings]
    }
    
    inline def DefaultLocationSettings(address: String, content: ContentObject): typings.kakaoJsSdk.Kakao.Link.DefaultLocationSettings = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], objectType = "location")
      __obj.asInstanceOf[typings.kakaoJsSdk.Kakao.Link.DefaultLocationSettings]
    }
    
    inline def DefaultTextSettings(link: LinkObject, text: String): typings.kakaoJsSdk.Kakao.Link.DefaultTextSettings = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], objectType = "text", text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.kakaoJsSdk.Kakao.Link.DefaultTextSettings]
    }
  }
  
  trait DefaultTextSettings
    extends StObject
       with BaseObject[text]
       with DefaultSettings {
    
    var link: LinkObject
    
    var text: String
  }
  object DefaultTextSettings {
    
    inline def apply(link: LinkObject, text: String): DefaultTextSettings = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], objectType = "text", text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultTextSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultTextSettings] (val x: Self) extends AnyVal {
      
      inline def setLink(value: LinkObject): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageInfos extends StObject {
    
    var original: Contenttype
  }
  object ImageInfos {
    
    inline def apply(original: Contenttype): ImageInfos = {
      val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageInfos]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageInfos] (val x: Self) extends AnyVal {
      
      inline def setOriginal(value: Contenttype): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinkCallback extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait LinkObject extends StObject {
    
    var androidExecParams: js.UndefOr[String] = js.undefined
    
    var iosExecParams: js.UndefOr[String] = js.undefined
    
    var mobileWebUrl: js.UndefOr[String] = js.undefined
    
    var webUrl: js.UndefOr[String] = js.undefined
  }
  object LinkObject {
    
    inline def apply(): LinkObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkObject] (val x: Self) extends AnyVal {
      
      inline def setAndroidExecParams(value: String): Self = StObject.set(x, "androidExecParams", value.asInstanceOf[js.Any])
      
      inline def setAndroidExecParamsUndefined: Self = StObject.set(x, "androidExecParams", js.undefined)
      
      inline def setIosExecParams(value: String): Self = StObject.set(x, "iosExecParams", value.asInstanceOf[js.Any])
      
      inline def setIosExecParamsUndefined: Self = StObject.set(x, "iosExecParams", js.undefined)
      
      inline def setMobileWebUrl(value: String): Self = StObject.set(x, "mobileWebUrl", value.asInstanceOf[js.Any])
      
      inline def setMobileWebUrlUndefined: Self = StObject.set(x, "mobileWebUrl", js.undefined)
      
      inline def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
      
      inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
    }
  }
  
  trait SocialObject extends StObject {
    
    var commentCount: js.UndefOr[Double] = js.undefined
    
    var likeCount: js.UndefOr[Double] = js.undefined
    
    var sharedCount: js.UndefOr[Double] = js.undefined
    
    var subscriberCount: js.UndefOr[Double] = js.undefined
    
    var viewCount: js.UndefOr[Double] = js.undefined
  }
  object SocialObject {
    
    inline def apply(): SocialObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SocialObject] (val x: Self) extends AnyVal {
      
      inline def setCommentCount(value: Double): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
      
      inline def setCommentCountUndefined: Self = StObject.set(x, "commentCount", js.undefined)
      
      inline def setLikeCount(value: Double): Self = StObject.set(x, "likeCount", value.asInstanceOf[js.Any])
      
      inline def setLikeCountUndefined: Self = StObject.set(x, "likeCount", js.undefined)
      
      inline def setSharedCount(value: Double): Self = StObject.set(x, "sharedCount", value.asInstanceOf[js.Any])
      
      inline def setSharedCountUndefined: Self = StObject.set(x, "sharedCount", js.undefined)
      
      inline def setSubscriberCount(value: Double): Self = StObject.set(x, "subscriberCount", value.asInstanceOf[js.Any])
      
      inline def setSubscriberCountUndefined: Self = StObject.set(x, "subscriberCount", js.undefined)
      
      inline def setViewCount(value: Double): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
      
      inline def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
    }
  }
}
