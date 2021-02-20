package typings.jestCucumberFusion

import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-cucumber-fusion", "After")
  @js.native
  def After(callback: js.Function0[Unit | js.Promise[Unit]]): Unit = js.native
  
  @JSImport("jest-cucumber-fusion", "And")
  @js.native
  def And(name: String, callback: CallBack): Unit = js.native
  @JSImport("jest-cucumber-fusion", "And")
  @js.native
  def And(name: RegExp, callback: CallBack): Unit = js.native
  
  @JSImport("jest-cucumber-fusion", "Before")
  @js.native
  def Before(callback: js.Function0[Unit | js.Promise[Unit]]): Unit = js.native
  
  @JSImport("jest-cucumber-fusion", "But")
  @js.native
  def But(name: String, callback: CallBack): Unit = js.native
  @JSImport("jest-cucumber-fusion", "But")
  @js.native
  def But(name: RegExp, callback: CallBack): Unit = js.native
  
  @JSImport("jest-cucumber-fusion", "Fusion")
  @js.native
  def Fusion(feature: String): Unit = js.native
  @JSImport("jest-cucumber-fusion", "Fusion")
  @js.native
  def Fusion_1(
    feature: String,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<jest-cucumber-fusion.anon.FnCall>[1] */ js.Any
  ): Unit = js.native
  
  @JSImport("jest-cucumber-fusion", "Given")
  @js.native
  def Given(name: String, callback: CallBack): Unit = js.native
  @JSImport("jest-cucumber-fusion", "Given")
  @js.native
  def Given(name: RegExp, callback: CallBack): Unit = js.native
  
  @JSImport("jest-cucumber-fusion", "Then")
  @js.native
  def Then(name: String, callback: CallBack): Unit = js.native
  @JSImport("jest-cucumber-fusion", "Then")
  @js.native
  def Then(name: RegExp, callback: CallBack): Unit = js.native
  
  @JSImport("jest-cucumber-fusion", "When")
  @js.native
  def When(name: String, callback: CallBack): Unit = js.native
  @JSImport("jest-cucumber-fusion", "When")
  @js.native
  def When(name: RegExp, callback: CallBack): Unit = js.native
  
  type CallBack = js.Function1[
    /* repeated */ String | (js.Array[Record[String, String]]), 
    Unit | js.Promise[Unit]
  ]
}
