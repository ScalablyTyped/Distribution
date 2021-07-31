package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attributes of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116.
  */
trait SchemaAttributes extends StObject {
  
  /**
    * The additional images of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#addlimage.
    */
  var additionalImageLink: js.UndefOr[js.Array[SchemaImage]] = js.undefined
  
  /**
    * The target age group of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#agegroup.
    */
  var ageGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The brand name of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#brand.
    */
  var brand: js.UndefOr[String] = js.undefined
  
  /**
    * The capacity of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#capacity.
    */
  var capacity: js.UndefOr[SchemaCapacity] = js.undefined
  
  /**
    * The color of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#color.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The count of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#count.
    */
  var count: js.UndefOr[SchemaCount] = js.undefined
  
  /**
    * The description of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The disclosure date of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#disclosure.
    */
  var disclosureDate: js.UndefOr[String] = js.undefined
  
  /**
    * A list of excluded destinations.
    */
  var excludedDestination: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The rich format description of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#featuredesc.
    */
  var featureDescription: js.UndefOr[js.Array[SchemaFeatureDescription]] = js.undefined
  
  /**
    * The flavor of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#flavor.
    */
  var flavor: js.UndefOr[String] = js.undefined
  
  /**
    * The format of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#format.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * The target gender of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#gender.
    */
  var gender: js.UndefOr[String] = js.undefined
  
  /**
    * The Global Trade Item Number (GTIN) of the product. For more information,
    * see https://support.google.com/manufacturers/answer/6124116#gtin.
    */
  var gtin: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The image of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#image.
    */
  var imageLink: js.UndefOr[SchemaImage] = js.undefined
  
  /**
    * A list of included destinations.
    */
  var includedDestination: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The item group id of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#itemgroupid.
    */
  var itemGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The material of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#material.
    */
  var material: js.UndefOr[String] = js.undefined
  
  /**
    * The Manufacturer Part Number (MPN) of the product. For more information,
    * see https://support.google.com/manufacturers/answer/6124116#mpn.
    */
  var mpn: js.UndefOr[String] = js.undefined
  
  /**
    * The pattern of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#pattern.
    */
  var pattern: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#productdetail.
    */
  var productDetail: js.UndefOr[js.Array[SchemaProductDetail]] = js.undefined
  
  /**
    * The name of the group of products related to the product. For more
    * information, see
    * https://support.google.com/manufacturers/answer/6124116#productline.
    */
  var productLine: js.UndefOr[String] = js.undefined
  
  /**
    * The canonical name of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#productname.
    */
  var productName: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the detail page of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#productpage.
    */
  var productPageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The type or category of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#producttype.
    */
  var productType: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The release date of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#release.
    */
  var releaseDate: js.UndefOr[String] = js.undefined
  
  /**
    * The scent of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#scent.
    */
  var scent: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#size.
    */
  var size: js.UndefOr[String] = js.undefined
  
  /**
    * The size system of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#sizesystem.
    */
  var sizeSystem: js.UndefOr[String] = js.undefined
  
  /**
    * The size type of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#sizetype.
    */
  var sizeType: js.UndefOr[String] = js.undefined
  
  /**
    * The suggested retail price (MSRP) of the product. For more information,
    * see https://support.google.com/manufacturers/answer/6124116#price.
    */
  var suggestedRetailPrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The target client id. Should only be used in the accounts of the data
    * partners.
    */
  var targetClientId: js.UndefOr[String] = js.undefined
  
  /**
    * The theme of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#theme.
    */
  var theme: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The videos of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#video.
    */
  var videoLink: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAttributes {
  
  @scala.inline
  def apply(): SchemaAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributes]
  }
  
  @scala.inline
  implicit class SchemaAttributesMutableBuilder[Self <: SchemaAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalImageLink(value: js.Array[SchemaImage]): Self = StObject.set(x, "additionalImageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalImageLinkUndefined: Self = StObject.set(x, "additionalImageLink", js.undefined)
    
    @scala.inline
    def setAdditionalImageLinkVarargs(value: SchemaImage*): Self = StObject.set(x, "additionalImageLink", js.Array(value :_*))
    
    @scala.inline
    def setAgeGroup(value: String): Self = StObject.set(x, "ageGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeGroupUndefined: Self = StObject.set(x, "ageGroup", js.undefined)
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setCapacity(value: SchemaCapacity): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCount(value: SchemaCount): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisclosureDate(value: String): Self = StObject.set(x, "disclosureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisclosureDateUndefined: Self = StObject.set(x, "disclosureDate", js.undefined)
    
    @scala.inline
    def setExcludedDestination(value: js.Array[String]): Self = StObject.set(x, "excludedDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedDestinationUndefined: Self = StObject.set(x, "excludedDestination", js.undefined)
    
    @scala.inline
    def setExcludedDestinationVarargs(value: String*): Self = StObject.set(x, "excludedDestination", js.Array(value :_*))
    
    @scala.inline
    def setFeatureDescription(value: js.Array[SchemaFeatureDescription]): Self = StObject.set(x, "featureDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureDescriptionUndefined: Self = StObject.set(x, "featureDescription", js.undefined)
    
    @scala.inline
    def setFeatureDescriptionVarargs(value: SchemaFeatureDescription*): Self = StObject.set(x, "featureDescription", js.Array(value :_*))
    
    @scala.inline
    def setFlavor(value: String): Self = StObject.set(x, "flavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlavorUndefined: Self = StObject.set(x, "flavor", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setGtin(value: js.Array[String]): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    @scala.inline
    def setGtinVarargs(value: String*): Self = StObject.set(x, "gtin", js.Array(value :_*))
    
    @scala.inline
    def setImageLink(value: SchemaImage): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
    
    @scala.inline
    def setIncludedDestination(value: js.Array[String]): Self = StObject.set(x, "includedDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedDestinationUndefined: Self = StObject.set(x, "includedDestination", js.undefined)
    
    @scala.inline
    def setIncludedDestinationVarargs(value: String*): Self = StObject.set(x, "includedDestination", js.Array(value :_*))
    
    @scala.inline
    def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    @scala.inline
    def setMaterial(value: String): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setProductDetail(value: js.Array[SchemaProductDetail]): Self = StObject.set(x, "productDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDetailUndefined: Self = StObject.set(x, "productDetail", js.undefined)
    
    @scala.inline
    def setProductDetailVarargs(value: SchemaProductDetail*): Self = StObject.set(x, "productDetail", js.Array(value :_*))
    
    @scala.inline
    def setProductLine(value: String): Self = StObject.set(x, "productLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductLineUndefined: Self = StObject.set(x, "productLine", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    @scala.inline
    def setProductPageUrl(value: String): Self = StObject.set(x, "productPageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductPageUrlUndefined: Self = StObject.set(x, "productPageUrl", js.undefined)
    
    @scala.inline
    def setProductType(value: js.Array[String]): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    @scala.inline
    def setProductTypeVarargs(value: String*): Self = StObject.set(x, "productType", js.Array(value :_*))
    
    @scala.inline
    def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    @scala.inline
    def setScent(value: String): Self = StObject.set(x, "scent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScentUndefined: Self = StObject.set(x, "scent", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeSystem(value: String): Self = StObject.set(x, "sizeSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeSystemUndefined: Self = StObject.set(x, "sizeSystem", js.undefined)
    
    @scala.inline
    def setSizeType(value: String): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSuggestedRetailPrice(value: SchemaPrice): Self = StObject.set(x, "suggestedRetailPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedRetailPriceUndefined: Self = StObject.set(x, "suggestedRetailPrice", js.undefined)
    
    @scala.inline
    def setTargetClientId(value: String): Self = StObject.set(x, "targetClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetClientIdUndefined: Self = StObject.set(x, "targetClientId", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVideoLink(value: js.Array[String]): Self = StObject.set(x, "videoLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoLinkUndefined: Self = StObject.set(x, "videoLink", js.undefined)
    
    @scala.inline
    def setVideoLinkVarargs(value: String*): Self = StObject.set(x, "videoLink", js.Array(value :_*))
  }
}
