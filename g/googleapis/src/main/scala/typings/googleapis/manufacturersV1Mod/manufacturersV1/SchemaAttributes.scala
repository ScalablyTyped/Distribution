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
  def apply(
    additionalImageLink: js.Array[SchemaImage] = null,
    ageGroup: String = null,
    brand: String = null,
    capacity: SchemaCapacity = null,
    color: String = null,
    count: SchemaCount = null,
    description: String = null,
    disclosureDate: String = null,
    excludedDestination: js.Array[String] = null,
    featureDescription: js.Array[SchemaFeatureDescription] = null,
    flavor: String = null,
    format: String = null,
    gender: String = null,
    gtin: js.Array[String] = null,
    imageLink: SchemaImage = null,
    includedDestination: js.Array[String] = null,
    itemGroupId: String = null,
    material: String = null,
    mpn: String = null,
    pattern: String = null,
    productDetail: js.Array[SchemaProductDetail] = null,
    productLine: String = null,
    productName: String = null,
    productPageUrl: String = null,
    productType: js.Array[String] = null,
    releaseDate: String = null,
    scent: String = null,
    size: String = null,
    sizeSystem: String = null,
    sizeType: String = null,
    suggestedRetailPrice: SchemaPrice = null,
    targetClientId: String = null,
    theme: String = null,
    title: String = null,
    videoLink: js.Array[String] = null
  ): SchemaAttributes = {
    val __obj = js.Dynamic.literal()
    if (additionalImageLink != null) __obj.updateDynamic("additionalImageLink")(additionalImageLink.asInstanceOf[js.Any])
    if (ageGroup != null) __obj.updateDynamic("ageGroup")(ageGroup.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (disclosureDate != null) __obj.updateDynamic("disclosureDate")(disclosureDate.asInstanceOf[js.Any])
    if (excludedDestination != null) __obj.updateDynamic("excludedDestination")(excludedDestination.asInstanceOf[js.Any])
    if (featureDescription != null) __obj.updateDynamic("featureDescription")(featureDescription.asInstanceOf[js.Any])
    if (flavor != null) __obj.updateDynamic("flavor")(flavor.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (gtin != null) __obj.updateDynamic("gtin")(gtin.asInstanceOf[js.Any])
    if (imageLink != null) __obj.updateDynamic("imageLink")(imageLink.asInstanceOf[js.Any])
    if (includedDestination != null) __obj.updateDynamic("includedDestination")(includedDestination.asInstanceOf[js.Any])
    if (itemGroupId != null) __obj.updateDynamic("itemGroupId")(itemGroupId.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (mpn != null) __obj.updateDynamic("mpn")(mpn.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (productDetail != null) __obj.updateDynamic("productDetail")(productDetail.asInstanceOf[js.Any])
    if (productLine != null) __obj.updateDynamic("productLine")(productLine.asInstanceOf[js.Any])
    if (productName != null) __obj.updateDynamic("productName")(productName.asInstanceOf[js.Any])
    if (productPageUrl != null) __obj.updateDynamic("productPageUrl")(productPageUrl.asInstanceOf[js.Any])
    if (productType != null) __obj.updateDynamic("productType")(productType.asInstanceOf[js.Any])
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate.asInstanceOf[js.Any])
    if (scent != null) __obj.updateDynamic("scent")(scent.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sizeSystem != null) __obj.updateDynamic("sizeSystem")(sizeSystem.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (suggestedRetailPrice != null) __obj.updateDynamic("suggestedRetailPrice")(suggestedRetailPrice.asInstanceOf[js.Any])
    if (targetClientId != null) __obj.updateDynamic("targetClientId")(targetClientId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (videoLink != null) __obj.updateDynamic("videoLink")(videoLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttributes]
  }
}

