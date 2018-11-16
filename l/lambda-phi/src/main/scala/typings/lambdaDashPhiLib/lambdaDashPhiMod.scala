package typings
package lambdaDashPhiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-phi", JSImport.Namespace)
@js.native
object lambdaDashPhiMod extends js.Object {
  def Callback(): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String, scala.Unit] = js.native
  def Context(): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String, scala.Unit] = js.native
  def Event(): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String, scala.Unit] = js.native
  def EventContext(): js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String, scala.Unit] = js.native
  def Lambda(): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def Lambda(lambdaConfig: lambdaDashPhiLib.libLambdaDashConfigMod.LambdaConfig): js.Function1[/* target */ js.Any, scala.Unit] = js.native
  def LambdaHandler(event: js.Any, context: js.Any, callback: js.Any): scala.Unit = js.native
  def PostConstructor(): js.Function2[/* target */ js.Object, /* methodName */ java.lang.String, scala.Unit] = js.native
  def PreLambdaCallback(): js.Function2[/* target */ js.Object, /* methodName */ java.lang.String, scala.Unit] = js.native
  def PreLambdaTimeout(miliSecondsBeforeTimeout: scala.Double): js.Function2[/* target */ js.Object, /* methodName */ java.lang.String, scala.Unit] = js.native
}

