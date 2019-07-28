package typings.lambdaDashPhi

import typings.lambdaDashPhi.libLambdaDashConfigMod.LambdaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-phi", JSImport.Namespace)
@js.native
object lambdaDashPhiMod extends js.Object {
  def Callback(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Context(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Event(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def EventContext(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Lambda(): js.Function1[/* target */ js.Any, Unit] = js.native
  def Lambda(lambdaConfig: LambdaConfig): js.Function1[/* target */ js.Any, Unit] = js.native
  def LambdaHandler(event: js.Any, context: js.Any, callback: js.Any): Unit = js.native
  def PostConstructor(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def PreLambdaCallback(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def PreLambdaTimeout(miliSecondsBeforeTimeout: Double): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
}

