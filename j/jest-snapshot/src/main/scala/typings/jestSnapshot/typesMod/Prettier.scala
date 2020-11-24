package typings.jestSnapshot.typesMod

import typings.jestSnapshot.anon.Typeofdoc
import typings.jestSnapshot.anon.TypeofgetFileInfo
import typings.jestSnapshot.anon.TypeofresolveConfig
import typings.jestSnapshot.anon.TypeofresolveConfigFile
import typings.jestSnapshot.anon.Typeofutil
import typings.prettier.mod.CursorOptions
import typings.prettier.mod.CursorResult
import typings.prettier.mod.Options
import typings.prettier.mod.SupportInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prettier extends js.Object {
  
  def check(source: String): Boolean = js.native
  def check(source: String, options: Options): Boolean = js.native
  
  def clearConfigCache(): Unit = js.native
  
  val doc: Typeofdoc = js.native
  
  def format(source: String): String = js.native
  def format(source: String, options: Options): String = js.native
  
  def formatWithCursor(source: String, options: CursorOptions): CursorResult = js.native
  
  val getFileInfo: TypeofgetFileInfo = js.native
  
  def getSupportInfo(): SupportInfo = js.native
  
  val resolveConfig: TypeofresolveConfig = js.native
  
  val resolveConfigFile: TypeofresolveConfigFile = js.native
  
  val util: Typeofutil = js.native
  
  val version: String = js.native
}
