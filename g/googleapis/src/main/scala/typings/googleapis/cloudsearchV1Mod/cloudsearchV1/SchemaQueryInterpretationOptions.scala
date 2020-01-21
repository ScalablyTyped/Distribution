package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to interpret user query.
  */
@js.native
trait SchemaQueryInterpretationOptions extends js.Object {
  /**
    * Flag to disable natural language (NL) interpretation of queries. Default
    * is false, Set to true to disable natural language interpretation. NL
    * interpretation only applies to predefined datasources.
    */
  var disableNlInterpretation: js.UndefOr[Boolean] = js.native
}

object SchemaQueryInterpretationOptions {
  @scala.inline
  def apply(disableNlInterpretation: js.UndefOr[Boolean] = js.undefined): SchemaQueryInterpretationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableNlInterpretation)) __obj.updateDynamic("disableNlInterpretation")(disableNlInterpretation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryInterpretationOptions]
  }
}

