package typings.konva

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsMod {
  
  @JSImport("konva/types/Validators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def RGBComponent(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBComponent")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def alphaComponent(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaComponent")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def getBooleanValidator(): js.Function2[/* val */ js.Any, /* attr */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBooleanValidator")().asInstanceOf[js.Function2[/* val */ js.Any, /* attr */ String, js.Any]]
  
  @scala.inline
  def getComponentValidator(components: js.Any): js.Function2[/* val */ js.Any, /* attr */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentValidator")(components.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* val */ js.Any, /* attr */ String, js.Any]]
  
  @scala.inline
  def getFunctionValidator(): js.Function2[/* val */ js.Any, /* attr */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionValidator")().asInstanceOf[js.Function2[/* val */ js.Any, /* attr */ String, js.Any]]
  
  @scala.inline
  def getNumberArrayValidator(): js.Function2[/* val */ js.Any, /* attr */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberArrayValidator")().asInstanceOf[js.Function2[/* val */ js.Any, /* attr */ String, js.Any]]
  
  @scala.inline
  def getNumberOrArrayOfNumbersValidator(noOfElements: Double): js.Function2[/* val */ js.Any, /* attr */ String, Unit | js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrArrayOfNumbersValidator")(noOfElements.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* val */ js.Any, /* attr */ String, Unit | js.Any]]
  
  @scala.inline
  def getNumberOrAutoValidator(): js.Function2[/* val */ String, /* attr */ String, Unit | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrAutoValidator")().asInstanceOf[js.Function2[/* val */ String, /* attr */ String, Unit | String]]
  
  @scala.inline
  def getNumberValidator(): js.Function2[/* val */ js.Any, /* attr */ String, Unit | js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberValidator")().asInstanceOf[js.Function2[/* val */ js.Any, /* attr */ String, Unit | js.Any]]
  
  @scala.inline
  def getStringOrGradientValidator(): js.Function2[/* val */ js.Any, /* attr */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringOrGradientValidator")().asInstanceOf[js.Function2[/* val */ js.Any, /* attr */ String, js.Any]]
  
  @scala.inline
  def getStringValidator(): js.Function2[/* val */ js.Any, /* attr */ String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringValidator")().asInstanceOf[js.Function2[/* val */ js.Any, /* attr */ String, js.Any]]
}
