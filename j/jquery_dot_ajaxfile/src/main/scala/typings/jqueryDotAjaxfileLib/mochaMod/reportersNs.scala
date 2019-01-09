package typings
package jqueryDotAjaxfileLib.mochaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters")
@js.native
object reportersNs extends js.Object {
  @js.native
  class Base protected ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.Base {
    def this(runner: jqueryDotAjaxfileLib.MochaNs.IRunner) = this()
  }
  
  @js.native
  class Doc ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.Doc
  
  @js.native
  class Dot ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.Dot
  
  @js.native
  class HTML ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.HTML
  
  @js.native
  class HTMLCov ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.HTMLCov
  
  @js.native
  class JSON ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.JSON
  
  @js.native
  class JSONCov ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.JSONCov
  
  @js.native
  class JSONStream ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.JSONStream
  
  @js.native
  class Landing ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.Landing
  
  @js.native
  class List ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.List
  
  @js.native
  class Markdown ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.Markdown
  
  @js.native
  class Min ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.Min
  
  @js.native
  class Nyan ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.Nyan
  
  @js.native
  class Progress protected ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.Progress {
    /**
      * @param options.open String used to indicate the start of the progress bar.
      * @param options.complete String used to indicate a complete test on the progress bar.
      * @param options.incomplete String used to indicate an incomplete test on the progress bar.
      * @param options.close String used to indicate the end of the progress bar.
      */
    def this(runner: jqueryDotAjaxfileLib.MochaNs.IRunner) = this()
    def this(runner: jqueryDotAjaxfileLib.MochaNs.IRunner, options: jqueryDotAjaxfileLib.Anon_Close) = this()
  }
  
  @js.native
  class Spec ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.Spec
  
  @js.native
  class TAP ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.TAP
  
  @js.native
  class XUnit protected ()
    extends jqueryDotAjaxfileLib.MochaNs.reportersNs.XUnit {
    def this(runner: jqueryDotAjaxfileLib.MochaNs.IRunner) = this()
    def this(runner: jqueryDotAjaxfileLib.MochaNs.IRunner, options: js.Any) = this()
  }
  
}

