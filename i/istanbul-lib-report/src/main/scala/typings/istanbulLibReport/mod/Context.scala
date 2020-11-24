package typings.istanbulLibReport.mod

import typings.istanbulLibReport.istanbulLibReportStrings.branches
import typings.istanbulLibReport.istanbulLibReportStrings.functions
import typings.istanbulLibReport.istanbulLibReportStrings.lines
import typings.istanbulLibReport.istanbulLibReportStrings.statements
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  @JSName("classForPercent")
  def classForPercent_branches(`type`: branches, value: Double): String = js.native
  @JSName("classForPercent")
  def classForPercent_functions(`type`: functions, value: Double): String = js.native
  @JSName("classForPercent")
  def classForPercent_lines(`type`: lines, value: Double): String = js.native
  /**
    * returns the coverage class given a coverage
    * types and a percentage value.
    */
  @JSName("classForPercent")
  def classForPercent_statements(`type`: statements, value: Double): String = js.native
  
  var data: js.Any = js.native
  
  var dir: String = js.native
  
  /**
    * returns the source code for the specified file path or throws if
    * the source could not be found.
    */
  def getSource(filepath: String): String = js.native
  
  def getTree(): Tree[Node] = js.native
  def getTree(summarizer: Summarizers): Tree[Node] = js.native
  
  /**
    * returns a full visitor given a partial one.
    */
  def getVisitor[N /* <: Node */](visitor: Partial[Visitor[N]]): Visitor[N] = js.native
  
  /**
    * returns a FileWriter implementation for reporting use. Also available
    * as the `writer` property on the context.
    */
  def getWriter(): FileWriter = js.native
  
  /**
    * returns an XML writer for the supplied content writer
    */
  def getXmlWriter(contentWriter: ContentWriter): XmlWriter = js.native
  
  def sourceFinder(filepath: String): String = js.native
  
  var watermarks: Watermarks = js.native
  
  var writer: FileWriter = js.native
}
