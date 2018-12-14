package typings
package lessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LessStatic extends js.Object {
  var importManager: js.UndefOr[lessLib.LessNs.ImportManager] = js.native
  var options: lessLib.LessNs.StaticOptions = js.native
  var sheets: js.Array[stdLib.HTMLLinkElement] = js.native
  var version: js.Array[scala.Double] = js.native
  def modifyVars(vars: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[lessLib.LessNs.RefreshOutput] = js.native
  def refresh(): js.Promise[lessLib.LessNs.RefreshOutput] = js.native
  def refresh(reload: scala.Boolean): js.Promise[lessLib.LessNs.RefreshOutput] = js.native
  def refresh(reload: scala.Boolean, modifyVars: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[lessLib.LessNs.RefreshOutput] = js.native
  def refresh(
    reload: scala.Boolean,
    modifyVars: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    clearFileCache: scala.Boolean
  ): js.Promise[lessLib.LessNs.RefreshOutput] = js.native
  def refreshStyles(): scala.Unit = js.native
  def render(input: java.lang.String): js.Promise[lessLib.LessNs.RenderOutput] = js.native
  def render(
    input: java.lang.String,
    callback: js.Function2[
      /* error */ lessLib.LessNs.RenderError, 
      /* output */ lessLib.LessNs.RenderOutput, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def render(input: java.lang.String, options: lessLib.LessNs.Options): js.Promise[lessLib.LessNs.RenderOutput] = js.native
  def render(
    input: java.lang.String,
    options: lessLib.LessNs.Options,
    callback: js.Function2[
      /* error */ lessLib.LessNs.RenderError, 
      /* output */ lessLib.LessNs.RenderOutput, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def watch(): scala.Unit = js.native
}

