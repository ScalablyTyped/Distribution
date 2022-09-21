package typings.less

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.less.Less.ImportManager
import typings.less.Less.Options
import typings.less.Less.RefreshOutput
import typings.less.Less.RenderError
import typings.less.Less.RenderOutput
import typings.less.Less.StaticOptions
import typings.std.HTMLLinkElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LessStatic extends StObject {
  
  var FileManager: Instantiable0[typings.less.Less.FileManager] = js.native
  
  var PluginManager: Instantiable1[/* less */ LessStatic, typings.less.Less.PluginManager] = js.native
  
  var importManager: js.UndefOr[ImportManager] = js.native
  
  def modifyVars(vars: StringDictionary[String]): js.Promise[RefreshOutput] = js.native
  
  var options: StaticOptions = js.native
  
  def refresh(): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Boolean): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Boolean, modifyVars: StringDictionary[String]): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Boolean, modifyVars: StringDictionary[String], clearFileCache: Boolean): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Boolean, modifyVars: Unit, clearFileCache: Boolean): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Unit, modifyVars: StringDictionary[String]): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Unit, modifyVars: StringDictionary[String], clearFileCache: Boolean): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Unit, modifyVars: Unit, clearFileCache: Boolean): js.Promise[RefreshOutput] = js.native
  
  def refreshStyles(): Unit = js.native
  
  def render(input: String): js.Promise[RenderOutput] = js.native
  def render(
    input: String,
    callback: js.Function2[/* error */ RenderError, /* output */ js.UndefOr[RenderOutput], Unit]
  ): Unit = js.native
  def render(input: String, options: Options): js.Promise[RenderOutput] = js.native
  def render(
    input: String,
    options: Options,
    callback: js.Function2[/* error */ RenderError, /* output */ js.UndefOr[RenderOutput], Unit]
  ): Unit = js.native
  
  var sheets: js.Array[HTMLLinkElement] = js.native
  
  var version: js.Array[Double] = js.native
  
  def watch(): Unit = js.native
}
