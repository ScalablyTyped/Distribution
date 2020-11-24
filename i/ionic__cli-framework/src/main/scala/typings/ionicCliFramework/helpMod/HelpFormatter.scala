package typings.ionicCliFramework.helpMod

import typings.ionicCliFramework.anon.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/lib/help", "HelpFormatter")
@js.native
abstract class HelpFormatter protected () extends js.Object {
  def this(hasColors: Colors) = this()
  
  val colors: typings.ionicCliFramework.colorsMod.Colors = js.native
  
  def format(): js.Promise[String] = js.native
}
