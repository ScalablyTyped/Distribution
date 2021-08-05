package typings.lambdaPhi

import typings.lambdaPhi.lambdaConfigMod.LambdaConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lambda-phi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Callback(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Callback")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def Context(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Context")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def Event(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Event")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def EventContext(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("EventContext")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def Lambda(): js.Function1[/* target */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda")().asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  inline def Lambda(lambdaConfig: LambdaConfig): js.Function1[/* target */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Lambda")(lambdaConfig.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
  inline def LambdaHandler(event: js.Any, context: js.Any, callback: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LambdaHandler")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def PostConstructor(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PostConstructor")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  inline def PreLambdaCallback(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PreLambdaCallback")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  inline def PreLambdaTimeout(miliSecondsBeforeTimeout: Double): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PreLambdaTimeout")(miliSecondsBeforeTimeout.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
}
