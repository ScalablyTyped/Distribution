package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attributes of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116.
  */
@js.native
trait SchemaAttributes extends js.Object {
  /**
    * The additional images of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#addlimage.
    */
  var additionalImageLink: js.UndefOr[js.Array[SchemaImage]] = js.native
  /**
    * The target age group of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#agegroup.
    */
  var ageGroup: js.UndefOr[String] = js.native
  /**
    * The brand name of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#brand.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * The capacity of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#capacity.
    */
  var capacity: js.UndefOr[SchemaCapacity] = js.native
  /**
    * The color of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#color.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The count of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#count.
    */
  var count: js.UndefOr[SchemaCount] = js.native
  /**
    * The description of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The disclosure date of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#disclosure.
    */
  var disclosureDate: js.UndefOr[String] = js.native
  /**
    * A list of excluded destinations.
    */
  var excludedDestination: js.UndefOr[js.Array[String]] = js.native
  /**
    * The rich format description of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#featuredesc.
    */
  var featureDescription: js.UndefOr[js.Array[SchemaFeatureDescription]] = js.native
  /**
    * The flavor of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#flavor.
    */
  var flavor: js.UndefOr[String] = js.native
  /**
    * The format of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The target gender of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#gender.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * The Global Trade Item Number (GTIN) of the product. For more information,
    * see https://support.google.com/manufacturers/answer/6124116#gtin.
    */
  var gtin: js.UndefOr[js.Array[String]] = js.native
  /**
    * The image of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#image.
    */
  var imageLink: js.UndefOr[SchemaImage] = js.native
  /**
    * A list of included destinations.
    */
  var includedDestination: js.UndefOr[js.Array[String]] = js.native
  /**
    * The item group id of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#itemgroupid.
    */
  var itemGroupId: js.UndefOr[String] = js.native
  /**
    * The material of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#material.
    */
  var material: js.UndefOr[String] = js.native
  /**
    * The Manufacturer Part Number (MPN) of the product. For more information,
    * see https://support.google.com/manufacturers/answer/6124116#mpn.
    */
  var mpn: js.UndefOr[String] = js.native
  /**
    * The pattern of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#pattern.
    */
  var pattern: js.UndefOr[String] = js.native
  /**
    * The details of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#productdetail.
    */
  var productDetail: js.UndefOr[js.Array[SchemaProductDetail]] = js.native
  /**
    * The name of the group of products related to the product. For more
    * information, see
    * https://support.google.com/manufacturers/answer/6124116#productline.
    */
  var productLine: js.UndefOr[String] = js.native
  /**
    * The canonical name of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#productname.
    */
  var productName: js.UndefOr[String] = js.native
  /**
    * The URL of the detail page of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#productpage.
    */
  var productPageUrl: js.UndefOr[String] = js.native
  /**
    * The type or category of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#producttype.
    */
  var productType: js.UndefOr[js.Array[String]] = js.native
  /**
    * The release date of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#release.
    */
  var releaseDate: js.UndefOr[String] = js.native
  /**
    * The scent of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#scent.
    */
  var scent: js.UndefOr[String] = js.native
  /**
    * The size of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#size.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * The size system of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#sizesystem.
    */
  var sizeSystem: js.UndefOr[String] = js.native
  /**
    * The size type of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#sizetype.
    */
  var sizeType: js.UndefOr[String] = js.native
  /**
    * The suggested retail price (MSRP) of the product. For more information,
    * see https://support.google.com/manufacturers/answer/6124116#price.
    */
  var suggestedRetailPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * The target client id. Should only be used in the accounts of the data
    * partners.
    */
  var targetClientId: js.UndefOr[String] = js.native
  /**
    * The theme of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#theme.
    */
  var theme: js.UndefOr[String] = js.native
  /**
    * The title of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#title.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The videos of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#video.
    */
  var videoLink: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAttributes {
  @scala.inline
  def apply(): SchemaAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributes]
  }
  @scala.inline
  implicit class SchemaAttributesOps[Self <: SchemaAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdditionalImageLinkVarargs(value: SchemaImage*): Self = this.set("additionalImageLink", js.Array(value :_*))
    @scala.inline
    def setAdditionalImageLink(value: js.Array[SchemaImage]): Self = this.set("additionalImageLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalImageLink: Self = this.set("additionalImageLink", js.undefined)
    @scala.inline
    def setAgeGroup(value: String): Self = this.set("ageGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgeGroup: Self = this.set("ageGroup", js.undefined)
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    @scala.inline
    def setCapacity(value: SchemaCapacity): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCount(value: SchemaCount): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisclosureDate(value: String): Self = this.set("disclosureDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisclosureDate: Self = this.set("disclosureDate", js.undefined)
    @scala.inline
    def setExcludedDestinationVarargs(value: String*): Self = this.set("excludedDestination", js.Array(value :_*))
    @scala.inline
    def setExcludedDestination(value: js.Array[String]): Self = this.set("excludedDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedDestination: Self = this.set("excludedDestination", js.undefined)
    @scala.inline
    def setFeatureDescriptionVarargs(value: SchemaFeatureDescription*): Self = this.set("featureDescription", js.Array(value :_*))
    @scala.inline
    def setFeatureDescription(value: js.Array[SchemaFeatureDescription]): Self = this.set("featureDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureDescription: Self = this.set("featureDescription", js.undefined)
    @scala.inline
    def setFlavor(value: String): Self = this.set("flavor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlavor: Self = this.set("flavor", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setGtinVarargs(value: String*): Self = this.set("gtin", js.Array(value :_*))
    @scala.inline
    def setGtin(value: js.Array[String]): Self = this.set("gtin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGtin: Self = this.set("gtin", js.undefined)
    @scala.inline
    def setImageLink(value: SchemaImage): Self = this.set("imageLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageLink: Self = this.set("imageLink", js.undefined)
    @scala.inline
    def setIncludedDestinationVarargs(value: String*): Self = this.set("includedDestination", js.Array(value :_*))
    @scala.inline
    def setIncludedDestination(value: js.Array[String]): Self = this.set("includedDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedDestination: Self = this.set("includedDestination", js.undefined)
    @scala.inline
    def setItemGroupId(value: String): Self = this.set("itemGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemGroupId: Self = this.set("itemGroupId", js.undefined)
    @scala.inline
    def setMaterial(value: String): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setMpn(value: String): Self = this.set("mpn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMpn: Self = this.set("mpn", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setProductDetailVarargs(value: SchemaProductDetail*): Self = this.set("productDetail", js.Array(value :_*))
    @scala.inline
    def setProductDetail(value: js.Array[SchemaProductDetail]): Self = this.set("productDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductDetail: Self = this.set("productDetail", js.undefined)
    @scala.inline
    def setProductLine(value: String): Self = this.set("productLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductLine: Self = this.set("productLine", js.undefined)
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    @scala.inline
    def setProductPageUrl(value: String): Self = this.set("productPageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductPageUrl: Self = this.set("productPageUrl", js.undefined)
    @scala.inline
    def setProductTypeVarargs(value: String*): Self = this.set("productType", js.Array(value :_*))
    @scala.inline
    def setProductType(value: js.Array[String]): Self = this.set("productType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductType: Self = this.set("productType", js.undefined)
    @scala.inline
    def setReleaseDate(value: String): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseDate: Self = this.set("releaseDate", js.undefined)
    @scala.inline
    def setScent(value: String): Self = this.set("scent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScent: Self = this.set("scent", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSizeSystem(value: String): Self = this.set("sizeSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeSystem: Self = this.set("sizeSystem", js.undefined)
    @scala.inline
    def setSizeType(value: String): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    @scala.inline
    def setSuggestedRetailPrice(value: SchemaPrice): Self = this.set("suggestedRetailPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedRetailPrice: Self = this.set("suggestedRetailPrice", js.undefined)
    @scala.inline
    def setTargetClientId(value: String): Self = this.set("targetClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetClientId: Self = this.set("targetClientId", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVideoLinkVarargs(value: String*): Self = this.set("videoLink", js.Array(value :_*))
    @scala.inline
    def setVideoLink(value: js.Array[String]): Self = this.set("videoLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoLink: Self = this.set("videoLink", js.undefined)
  }
  
}

