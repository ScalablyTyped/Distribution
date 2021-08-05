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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("istanbul-reports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create_clover(name: clover): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_clover(name: clover, options: Partial[CloverOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_cobertura(name: cobertura): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_cobertura(name: cobertura, options: Partial[CoberturaOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_html(name: html): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_html(name: html, options: Partial[HtmlOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_htmlspa(name: `html-spa`): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_htmlspa(name: `html-spa`, options: Partial[HtmlSpaOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_json(name: json): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_json(name: json, options: Partial[JsonOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_jsonsummary(name: `json-summary`): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_jsonsummary(name: `json-summary`, options: Partial[JsonSummaryOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_lcov(name: lcov): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_lcov(name: lcov, options: Partial[LcovOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_lcovonly(name: lcovonly): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_lcovonly(name: lcovonly, options: Partial[LcovOnlyOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_none(name: none): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_none(name: none, options: Partial[scala.Nothing]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_teamcity(name: teamcity): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_teamcity(name: teamcity, options: Partial[TeamcityOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_text(name: text): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_text(name: text, options: Partial[TextOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_textlcov(name: `text-lcov`): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_textlcov(name: `text-lcov`, options: Partial[TextLcovOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  inline def create_textsummary(name: `text-summary`): Visitor[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any]).asInstanceOf[Visitor[Node]]
  inline def create_textsummary(name: `text-summary`, options: Partial[TextSummaryOptions]): Visitor[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Visitor[Node]]
  
  trait CloverOptions
    extends StObject
       with FileOptions
       with ProjectOptions
  object CloverOptions {
    
    inline def apply(file: String, projectRoot: String): CloverOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloverOptions]
    }
  }
  
  trait CoberturaOptions
    extends StObject
       with FileOptions
       with ProjectOptions
  object CoberturaOptions {
    
    inline def apply(file: String, projectRoot: String): CoberturaOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoberturaOptions]
    }
  }
  
  trait FileOptions extends StObject {
    
    var file: String
  }
  object FileOptions {
    
    inline def apply(file: String): FileOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileOptions]
    }
    
    extension [Self <: FileOptions](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlOptions extends StObject {
    
    var linkMapper: LinkMapper
    
    var skipEmpty: Boolean
    
    var subdir: String
    
    var verbose: Boolean
  }
  object HtmlOptions {
    
    inline def apply(linkMapper: LinkMapper, skipEmpty: Boolean, subdir: String, verbose: Boolean): HtmlOptions = {
      val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlOptions]
    }
    
    extension [Self <: HtmlOptions](x: Self) {
      
      inline def setLinkMapper(value: LinkMapper): Self = StObject.set(x, "linkMapper", value.asInstanceOf[js.Any])
      
      inline def setSkipEmpty(value: Boolean): Self = StObject.set(x, "skipEmpty", value.asInstanceOf[js.Any])
      
      inline def setSubdir(value: String): Self = StObject.set(x, "subdir", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  trait HtmlSpaOptions
    extends StObject
       with HtmlOptions {
    
    var metricsToShow: js.Array[lines | branches | functions | statements]
  }
  object HtmlSpaOptions {
    
    inline def apply(
      linkMapper: LinkMapper,
      metricsToShow: js.Array[lines | branches | functions | statements],
      skipEmpty: Boolean,
      subdir: String,
      verbose: Boolean
    ): HtmlSpaOptions = {
      val __obj = js.Dynamic.literal(linkMapper = linkMapper.asInstanceOf[js.Any], metricsToShow = metricsToShow.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], subdir = subdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlSpaOptions]
    }
    
    extension [Self <: HtmlSpaOptions](x: Self) {
      
      inline def setMetricsToShow(value: js.Array[lines | branches | functions | statements]): Self = StObject.set(x, "metricsToShow", value.asInstanceOf[js.Any])
      
      inline def setMetricsToShowVarargs(value: (lines | branches | functions | statements)*): Self = StObject.set(x, "metricsToShow", js.Array(value :_*))
    }
  }
  
  type JsonOptions = FileOptions
  
  type JsonSummaryOptions = FileOptions
  
  trait LcovOnlyOptions
    extends StObject
       with FileOptions
       with ProjectOptions
  object LcovOnlyOptions {
    
    inline def apply(file: String, projectRoot: String): LcovOnlyOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[LcovOnlyOptions]
    }
  }
  
  trait LcovOptions
    extends StObject
       with FileOptions
       with ProjectOptions
  object LcovOptions {
    
    inline def apply(file: String, projectRoot: String): LcovOptions = {
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
  
  trait ProjectOptions extends StObject {
    
    var projectRoot: String
  }
  object ProjectOptions {
    
    inline def apply(projectRoot: String): ProjectOptions = {
      val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectOptions]
    }
    
    extension [Self <: ProjectOptions](x: Self) {
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReportOptions extends StObject {
    
    var clover: CloverOptions
    
    var cobertura: CoberturaOptions
    
    var html: HtmlOptions
    
    var `html-spa`: HtmlSpaOptions
    
    var json: JsonOptions
    
    var `json-summary`: JsonSummaryOptions
    
    var lcov: LcovOptions
    
    var lcovonly: LcovOnlyOptions
    
    var teamcity: TeamcityOptions
    
    var text: TextOptions
    
    var `text-lcov`: TextLcovOptions
    
    var `text-summary`: TextSummaryOptions
  }
  object ReportOptions {
    
    inline def apply(
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
    
    extension [Self <: ReportOptions](x: Self) {
      
      inline def setClover(value: CloverOptions): Self = StObject.set(x, "clover", value.asInstanceOf[js.Any])
      
      inline def setCobertura(value: CoberturaOptions): Self = StObject.set(x, "cobertura", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: HtmlOptions): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def `setHtml-spa`(value: HtmlSpaOptions): Self = StObject.set(x, "html-spa", value.asInstanceOf[js.Any])
      
      inline def setJson(value: JsonOptions): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def `setJson-summary`(value: JsonSummaryOptions): Self = StObject.set(x, "json-summary", value.asInstanceOf[js.Any])
      
      inline def setLcov(value: LcovOptions): Self = StObject.set(x, "lcov", value.asInstanceOf[js.Any])
      
      inline def setLcovonly(value: LcovOnlyOptions): Self = StObject.set(x, "lcovonly", value.asInstanceOf[js.Any])
      
      inline def setTeamcity(value: TeamcityOptions): Self = StObject.set(x, "teamcity", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def `setText-lcov`(value: TextLcovOptions): Self = StObject.set(x, "text-lcov", value.asInstanceOf[js.Any])
      
      inline def `setText-summary`(value: TextSummaryOptions): Self = StObject.set(x, "text-summary", value.asInstanceOf[js.Any])
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
  
  trait TeamcityOptions
    extends StObject
       with FileOptions {
    
    var blockName: String
  }
  object TeamcityOptions {
    
    inline def apply(blockName: String, file: String): TeamcityOptions = {
      val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[TeamcityOptions]
    }
    
    extension [Self <: TeamcityOptions](x: Self) {
      
      inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    }
  }
  
  type TextLcovOptions = ProjectOptions
  
  trait TextOptions
    extends StObject
       with FileOptions {
    
    var maxCols: Double
    
    var skipEmpty: Boolean
    
    var skipFull: Boolean
  }
  object TextOptions {
    
    inline def apply(file: String, maxCols: Double, skipEmpty: Boolean, skipFull: Boolean): TextOptions = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], maxCols = maxCols.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], skipFull = skipFull.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextOptions]
    }
    
    extension [Self <: TextOptions](x: Self) {
      
      inline def setMaxCols(value: Double): Self = StObject.set(x, "maxCols", value.asInstanceOf[js.Any])
      
      inline def setSkipEmpty(value: Boolean): Self = StObject.set(x, "skipEmpty", value.asInstanceOf[js.Any])
      
      inline def setSkipFull(value: Boolean): Self = StObject.set(x, "skipFull", value.asInstanceOf[js.Any])
    }
  }
  
  type TextSummaryOptions = FileOptions
}
