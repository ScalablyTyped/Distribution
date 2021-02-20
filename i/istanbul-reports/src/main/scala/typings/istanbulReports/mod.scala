package typings.istanbulReports

import typings.istanbulLibReport.mod.Node
import typings.istanbulLibReport.mod.Visitor
import typings.istanbulReports.istanbulReportsStrings.`html-spa`
import typings.istanbulReports.istanbulReportsStrings.`json-summary`
import typings.istanbulReports.istanbulReportsStrings.`text-lcov`
import typings.istanbulReports.istanbulReportsStrings.`text-summary`
import typings.istanbulReports.istanbulReportsStrings.branches
import typings.istanbulReports.istanbulReportsStrings.clover
import typings.istanbulReports.istanbulReportsStrings.cobertura
import typings.istanbulReports.istanbulReportsStrings.functions
import typings.istanbulReports.istanbulReportsStrings.html
import typings.istanbulReports.istanbulReportsStrings.json
import typings.istanbulReports.istanbulReportsStrings.lcov
import typings.istanbulReports.istanbulReportsStrings.lcovonly
import typings.istanbulReports.istanbulReportsStrings.lines
import typings.istanbulReports.istanbulReportsStrings.none
import typings.istanbulReports.istanbulReportsStrings.statements
import typings.istanbulReports.istanbulReportsStrings.teamcity
import typings.istanbulReports.istanbulReportsStrings.text
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_clover(name: clover): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_clover(name: clover, options: Partial[CloverOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_cobertura(name: cobertura): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_cobertura(name: cobertura, options: Partial[CoberturaOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_html(name: html): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_html(name: html, options: Partial[HtmlOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_htmlspa(name: `html-spa`): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_htmlspa(name: `html-spa`, options: Partial[HtmlSpaOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_json(name: json): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_json(name: json, options: Partial[JsonOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_jsonsummary(name: `json-summary`): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_jsonsummary(name: `json-summary`, options: Partial[JsonSummaryOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_lcov(name: lcov): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_lcov(name: lcov, options: Partial[LcovOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_lcovonly(name: lcovonly): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_lcovonly(name: lcovonly, options: Partial[LcovOnlyOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_none(name: none): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_none(name: none, options: Partial[scala.Nothing]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_teamcity(name: teamcity): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_teamcity(name: teamcity, options: Partial[TeamcityOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_text(name: text): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_text(name: text, options: Partial[TextOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_textlcov(name: `text-lcov`): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_textlcov(name: `text-lcov`, options: Partial[TextLcovOptions]): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_textsummary(name: `text-summary`): Visitor[Node] = js.native
  @JSImport("istanbul-reports", "create")
  @js.native
  def create_textsummary(name: `text-summary`, options: Partial[TextSummaryOptions]): Visitor[Node] = js.native
  
  @js.native
  trait CloverOptions
    extends FileOptions
       with ProjectOptions
  object CloverOptions {
    
    @scala.inline
    def apply(file: String, projectRoot: String): CloverOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloverOptions]
    }
  }
  
  @js.native
  trait CoberturaOptions
    extends FileOptions
       with ProjectOptions
  object CoberturaOptions {
    
    @scala.inline
    def apply(file: String, projectRoot: String): CoberturaOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoberturaOptions]
    }
  }
  
  @js.native
  trait FileOptions extends StObject {
    
    var file: String = js.native
  }
  object FileOptions {
    
    @scala.inline
    def apply(file: String): FileOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileOptions]
    }
    
    @scala.inline
    implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HtmlOptions extends StObject {
    
    var linkMapper: LinkMapper = js.native
    
    var skipEmpty: Boolean = js.native
    
    var subdir: String = js.native
    
    var verbose: Boolean = js.native
  }
  object HtmlOptions {
    
    @scala.inline
    def apply(linkMapper: LinkMapper, skipEmpty: Boolean, subdir: String, verbose: Boolean): HtmlOptions = {
      val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlOptions]
    }
    
    @scala.inline
    implicit class HtmlOptionsMutableBuilder[Self <: HtmlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinkMapper(value: LinkMapper): Self = StObject.set(x, "linkMapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEmpty(value: Boolean): Self = StObject.set(x, "skipEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubdir(value: String): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HtmlSpaOptions extends HtmlOptions {
    
    var metricsToShow: js.Array[lines | branches | functions | statements] = js.native
  }
  object HtmlSpaOptions {
    
    @scala.inline
    def apply(
      linkMapper: LinkMapper,
      metricsToShow: js.Array[lines | branches | functions | statements],
      skipEmpty: Boolean,
      subdir: String,
      verbose: Boolean
    ): HtmlSpaOptions = {
      val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], metricsToShow = metricsToShow.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlSpaOptions]
    }
    
    @scala.inline
    implicit class HtmlSpaOptionsMutableBuilder[Self <: HtmlSpaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetricsToShow(value: js.Array[lines | branches | functions | statements]): Self = StObject.set(x, "metricsToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricsToShowVarargs(value: (lines | branches | functions | statements)*): Self = StObject.set(x, "metricsToShow", js.Array(value :_*))
    }
  }
  
  type JsonOptions = FileOptions
  
  type JsonSummaryOptions = FileOptions
  
  @js.native
  trait LcovOnlyOptions
    extends FileOptions
       with ProjectOptions
  object LcovOnlyOptions {
    
    @scala.inline
    def apply(file: String, projectRoot: String): LcovOnlyOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovOnlyOptions]
    }
  }
  
  @js.native
  trait LcovOptions
    extends FileOptions
       with ProjectOptions
  object LcovOptions {
    
    @scala.inline
    def apply(file: String, projectRoot: String): LcovOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovOptions]
    }
  }
  
  @js.native
  trait LinkMapper extends StObject {
    
    def assetPath(node: Node, name: String): String = js.native
    
    def getPath(node: String): String = js.native
    def getPath(node: Node): String = js.native
    
    def relativePath(source: String, target: String): String = js.native
    def relativePath(source: String, target: Node): String = js.native
    def relativePath(source: Node, target: String): String = js.native
    def relativePath(source: Node, target: Node): String = js.native
  }
  
  @js.native
  trait ProjectOptions extends StObject {
    
    var projectRoot: String = js.native
  }
  object ProjectOptions {
    
    @scala.inline
    def apply(projectRoot: String): ProjectOptions = {
      val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectOptions]
    }
    
    @scala.inline
    implicit class ProjectOptionsMutableBuilder[Self <: ProjectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReportOptions extends StObject {
    
    var clover: CloverOptions = js.native
    
    var cobertura: CoberturaOptions = js.native
    
    var html: HtmlOptions = js.native
    
    var `html-spa`: HtmlSpaOptions = js.native
    
    var json: JsonOptions = js.native
    
    var `json-summary`: JsonSummaryOptions = js.native
    
    var lcov: LcovOptions = js.native
    
    var lcovonly: LcovOnlyOptions = js.native
    
    var teamcity: TeamcityOptions = js.native
    
    var text: TextOptions = js.native
    
    var `text-lcov`: TextLcovOptions = js.native
    
    var `text-summary`: TextSummaryOptions = js.native
  }
  object ReportOptions {
    
    @scala.inline
    def apply(
      clover: CloverOptions,
      cobertura: CoberturaOptions,
      html: HtmlOptions,
      `html-spa`: HtmlSpaOptions,
      json: JsonOptions,
      `json-summary`: JsonSummaryOptions,
      lcov: LcovOptions,
      lcovonly: LcovOnlyOptions,
      teamcity: TeamcityOptions,
      text: TextOptions,
      `text-lcov`: TextLcovOptions,
      `text-summary`: TextSummaryOptions
    ): ReportOptions = {
      val __obj = js.Dynamic.literal(clover = clover.asInstanceOf[js.Any], cobertura = cobertura.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], lcov = lcov.asInstanceOf[js.Any], lcovonly = lcovonly.asInstanceOf[js.Any], teamcity = teamcity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("html-spa")(`html-spa`.asInstanceOf[js.Any])
      __obj.updateDynamic("json-summary")(`json-summary`.asInstanceOf[js.Any])
      __obj.updateDynamic("text-lcov")(`text-lcov`.asInstanceOf[js.Any])
      __obj.updateDynamic("text-summary")(`text-summary`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportOptions]
    }
    
    @scala.inline
    implicit class ReportOptionsMutableBuilder[Self <: ReportOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClover(value: CloverOptions): Self = StObject.set(x, "clover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCobertura(value: CoberturaOptions): Self = StObject.set(x, "cobertura", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: HtmlOptions): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setHtml-spa`(value: HtmlSpaOptions): Self = StObject.set(x, "html-spa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: JsonOptions): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJson-summary`(value: JsonSummaryOptions): Self = StObject.set(x, "json-summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcov(value: LcovOptions): Self = StObject.set(x, "lcov", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLcovonly(value: LcovOnlyOptions): Self = StObject.set(x, "lcovonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamcity(value: TeamcityOptions): Self = StObject.set(x, "teamcity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: TextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-lcov`(value: TextLcovOptions): Self = StObject.set(x, "text-lcov", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setText-summary`(value: TextSummaryOptions): Self = StObject.set(x, "text-summary", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.istanbulReports.istanbulReportsStrings.clover
    - typings.istanbulReports.istanbulReportsStrings.cobertura
    - typings.istanbulReports.istanbulReportsStrings.`html-spa`
    - typings.istanbulReports.istanbulReportsStrings.html
    - typings.istanbulReports.istanbulReportsStrings.json
    - typings.istanbulReports.istanbulReportsStrings.`json-summary`
    - typings.istanbulReports.istanbulReportsStrings.lcov
    - typings.istanbulReports.istanbulReportsStrings.lcovonly
    - typings.istanbulReports.istanbulReportsStrings.none
    - typings.istanbulReports.istanbulReportsStrings.teamcity
    - typings.istanbulReports.istanbulReportsStrings.text
    - typings.istanbulReports.istanbulReportsStrings.`text-lcov`
    - typings.istanbulReports.istanbulReportsStrings.`text-summary`
  */
  trait ReportType extends StObject
  
  @js.native
  trait TeamcityOptions extends FileOptions {
    
    var blockName: String = js.native
  }
  object TeamcityOptions {
    
    @scala.inline
    def apply(blockName: String, file: String): TeamcityOptions = {
      val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamcityOptions]
    }
    
    @scala.inline
    implicit class TeamcityOptionsMutableBuilder[Self <: TeamcityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    }
  }
  
  type TextLcovOptions = ProjectOptions
  
  @js.native
  trait TextOptions extends FileOptions {
    
    var maxCols: Double = js.native
    
    var skipEmpty: Boolean = js.native
    
    var skipFull: Boolean = js.native
  }
  object TextOptions {
    
    @scala.inline
    def apply(file: String, maxCols: Double, skipEmpty: Boolean, skipFull: Boolean): TextOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], maxCols = maxCols.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], skipFull = skipFull.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextOptions]
    }
    
    @scala.inline
    implicit class TextOptionsMutableBuilder[Self <: TextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxCols(value: Double): Self = StObject.set(x, "maxCols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipEmpty(value: Boolean): Self = StObject.set(x, "skipEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFull(value: Boolean): Self = StObject.set(x, "skipFull", value.asInstanceOf[js.Any])
    }
  }
  
  type TextSummaryOptions = FileOptions
}
