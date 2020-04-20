package typings.jsts.mod.geom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "geom.PrecisionModel")
@js.native
/**
  * 
  * @param modelType
  */
class PrecisionModel ()
  extends typings.jsts.jsts.geom.PrecisionModel {
  def this(modelType: String) = this()
  def this(modelType: Double) = this()
}

/* static members */
@JSImport("jsts", "geom.PrecisionModel")
@js.native
object PrecisionModel extends js.Object {
  var FIXED: String = js.native
  var FLOATING: String = js.native
  var FLOATING_SINGLE: String = js.native
}

