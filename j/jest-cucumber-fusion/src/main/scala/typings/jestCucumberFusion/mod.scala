package typings.jestCucumberFusion

import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-cucumber-fusion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def After(callback: js.Function0[Unit | js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("After")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def And(name: String, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("And")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def And(name: RegExp, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("And")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def Before(callback: js.Function0[Unit | js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Before")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def But(name: String, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("But")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def But(name: RegExp, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("But")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def Fusion(feature: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Fusion")(feature.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def Fusion_1(
    feature: String,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jest-cucumber-fusion.anon.FnCall>[1] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Fusion")(feature.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def Given(name: String, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Given")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Given(name: RegExp, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Given")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def Then(name: String, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Then")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def Then(name: RegExp, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Then")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def When(name: String, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("When")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def When(name: RegExp, callback: CallBack): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("When")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait CallBack extends StObject {
    
    def apply(args: (String | (js.Array[Record[String, String]]))*): Unit | js.Promise[Unit] = js.native
  }
}
