package typings.jqueryDotAjaxfile.mochaMod

import typings.jqueryDotAjaxfile.Anon_Close
import typings.jqueryDotAjaxfile.MochaNs.IRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters")
@js.native
object reportersNs extends js.Object {
  @js.native
  class Base protected ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.Base {
    def this(runner: IRunner) = this()
  }
  
  @js.native
  class Doc ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.Doc
  
  @js.native
  class Dot ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.Dot
  
  @js.native
  class HTML ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.HTML
  
  @js.native
  class HTMLCov ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.HTMLCov
  
  @js.native
  class JSON ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.JSON
  
  @js.native
  class JSONCov ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.JSONCov
  
  @js.native
  class JSONStream ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.JSONStream
  
  @js.native
  class Landing ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.Landing
  
  @js.native
  class List ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.List
  
  @js.native
  class Markdown ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.Markdown
  
  @js.native
  class Min ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.Min
  
  @js.native
  class Nyan ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.Nyan
  
  @js.native
  class Progress protected ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.Progress {
    /**
      * @param options.open String used to indicate the start of the progress bar.
      * @param options.complete String used to indicate a complete test on the progress bar.
      * @param options.incomplete String used to indicate an incomplete test on the progress bar.
      * @param options.close String used to indicate the end of the progress bar.
      */
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: Anon_Close) = this()
  }
  
  @js.native
  class Spec ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.Spec
  
  @js.native
  class TAP ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.TAP
  
  @js.native
  class XUnit protected ()
    extends typings.jqueryDotAjaxfile.MochaNs.reportersNs.XUnit {
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: js.Any) = this()
  }
  
}

