package typings.lambdaPhi

import typings.lambdaPhi.lambdaConfigMod.LambdaConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lambda-phi", "Callback")
  @js.native
  def Callback(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi", "Context")
  @js.native
  def Context(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi", "Event")
  @js.native
  def Event(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi", "EventContext")
  @js.native
  def EventContext(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi", "Lambda")
  @js.native
  def Lambda(): js.Function1[/* target */ js.Any, Unit] = js.native
  @JSImport("lambda-phi", "Lambda")
  @js.native
  def Lambda(lambdaConfig: LambdaConfig): js.Function1[/* target */ js.Any, Unit] = js.native
  
  @JSImport("lambda-phi", "LambdaHandler")
  @js.native
  def LambdaHandler(event: js.Any, context: js.Any, callback: js.Any): Unit = js.native
  
  @JSImport("lambda-phi", "PostConstructor")
  @js.native
  def PostConstructor(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi", "PreLambdaCallback")
  @js.native
  def PreLambdaCallback(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi", "PreLambdaTimeout")
  @js.native
  def PreLambdaTimeout(miliSecondsBeforeTimeout: Double): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
}
