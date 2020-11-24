package typings.konva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/Validators", JSImport.Namespace)
@js.native
object validatorsMod extends js.Object {
  
  def RGBComponent(`val`: Double): Double = js.native
  
  def alphaComponent(`val`: Double): Double = js.native
  
  def getBooleanValidator(): js.Function2[/* val */ js.Any, /* attr */ String, _] = js.native
  
  def getComponentValidator(components: js.Any): js.Function2[/* val */ js.Any, /* attr */ String, _] = js.native
  
  def getFunctionValidator(): js.Function2[/* val */ js.Any, /* attr */ String, _] = js.native
  
  def getNumberArrayValidator(): js.Function2[/* val */ js.Any, /* attr */ String, _] = js.native
  
  def getNumberOrArrayOfNumbersValidator(noOfElements: Double): js.Function2[/* val */ js.Any, /* attr */ String, Unit | _] = js.native
  
  def getNumberOrAutoValidator(): js.Function2[/* val */ String, /* attr */ String, Unit | String] = js.native
  
  def getNumberValidator(): js.Function2[/* val */ js.Any, /* attr */ String, Unit | _] = js.native
  
  def getStringOrGradientValidator(): js.Function2[/* val */ js.Any, /* attr */ String, _] = js.native
  
  def getStringValidator(): js.Function2[/* val */ js.Any, /* attr */ String, _] = js.native
}
