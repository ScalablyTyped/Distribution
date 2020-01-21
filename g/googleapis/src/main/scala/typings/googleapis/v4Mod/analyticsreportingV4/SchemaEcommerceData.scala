package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * E-commerce details associated with the user activity.
  */
@js.native
trait SchemaEcommerceData extends js.Object {
  /**
    * Action associated with this e-commerce action.
    */
  var actionType: js.UndefOr[String] = js.native
  /**
    * The type of this e-commerce activity.
    */
  var ecommerceType: js.UndefOr[String] = js.native
  /**
    * Details of the products in this transaction.
    */
  var products: js.UndefOr[js.Array[SchemaProductData]] = js.native
  /**
    * Transaction details of this e-commerce action.
    */
  var transaction: js.UndefOr[SchemaTransactionData] = js.native
}

object SchemaEcommerceData {
  @scala.inline
  def apply(
    actionType: String = null,
    ecommerceType: String = null,
    products: js.Array[SchemaProductData] = null,
    transaction: SchemaTransactionData = null
  ): SchemaEcommerceData = {
    val __obj = js.Dynamic.literal()
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (ecommerceType != null) __obj.updateDynamic("ecommerceType")(ecommerceType.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEcommerceData]
  }
}

