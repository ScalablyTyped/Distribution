package typings.madge

import org.scalablytyped.runtime.StringDictionary
import typings.madge.madgeStrings.BT
import typings.madge.madgeStrings.LR
import typings.madge.madgeStrings.RL
import typings.madge.madgeStrings.TB
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a MadgeInstance for a given path.
    *
    * @param path A single file or directory, or an array of files/directories to read. A predefined tree can also be passed in as an object.
    * @param config The configuration to use (optional).
    * @returns A Promise resolved with the MadgeInstance object.
    */
  inline def apply(path: MadgePath): js.Promise[MadgeInstance] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MadgeInstance]]
  inline def apply(path: MadgePath, config: MadgeConfig): js.Promise[MadgeInstance] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MadgeInstance]]
  
  @JSImport("madge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The configuration options for creating a Madge instance.
    */
  trait MadgeConfig extends StObject {
    
    /**
      * Background color for the graph.
      *
      * @default '#000000'
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Base directory to use instead of the default.
      *
      * @default undefined
      */
    var baseDir: js.UndefOr[String] = js.undefined
    
    /**
      * Color to use for circular dependencies.
      *
      * @default '#ff6c60'
      */
    var cyclicNodeColor: js.UndefOr[String] = js.undefined
    
    /**
      * Function called with a dependency filepath (exclude a subtree by returning false).
      *
      * @default undefined
      */
    var dependencyFilter: js.UndefOr[js.Function1[/* id */ String, Boolean]] = js.undefined
    
    /**
      * Custom `detective` options for [dependency-tree](https://github.com/dependents/node-dependency-tree) and [precinct](https://github.com/dependents/node-precinct#usage).
      *
      * @default undefined
      */
    var detectiveOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Edge color to use in the graph.
      *
      * @default '#757575'
      */
    var edgeColor: js.UndefOr[String] = js.undefined
    
    /**
      * An array of RegExp for excluding modules.
      *
      * @default undefined
      */
    var excludeRegExp: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    /**
      * Valid file extensions used to find files in directories.
      *
      * @default ['js']
      */
    var fileExtensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Font name to use in the graph.
      *
      * @default 'Arial'
      */
    var fontName: js.UndefOr[String] = js.undefined
    
    /**
      * Font size to use in the graph.
      *
      * @default '14px'
      */
    var fontSize: js.UndefOr[String] = js.undefined
    
    /**
      * Custom Graphviz [options](https://graphviz.gitlab.io/_pages/doc/info/attrs.html).
      *
      * @default undefined
      */
    var graphVizOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Custom Graphviz path.
      *
      * @default undefined
      */
    var graphVizPath: js.UndefOr[String] = js.undefined
    
    /**
      * If shallow NPM modules should be included.
      *
      * @default false
      */
    var includeNpm: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Layout to use in the graph.
      *
      * @default 'dot'
      */
    var layout: js.UndefOr[String] = js.undefined
    
    /**
      * Color to use for nodes with no dependencies.
      *
      * @default '#cfffac'
      */
    var noDependencyColor: js.UndefOr[String] = js.undefined
    
    /**
      * Default node color to use in the graph.
      *
      * @default '#c6c5fe'
      */
    var nodeColor: js.UndefOr[String] = js.undefined
    
    /**
      * A string specifying the [shape](https://graphviz.gitlab.io/_pages/doc/info/attrs.html#k:shape) of a node in the graph.
      *
      * @default 'box'
      */
    var nodeShape: js.UndefOr[String] = js.undefined
    
    /**
      * A string specifying the [style](https://graphviz.gitlab.io/_pages/doc/info/attrs.html#k:style) of a node in the graph.
      *
      * @default 'rounded'
      */
    var nodeStyle: js.UndefOr[String] = js.undefined
    
    /**
      * Sets the [direction](https://graphviz.gitlab.io/_pages/doc/info/attrs.html#d:rankdir) of the graph layout.
      *
      * @default 'LR'
      */
    var rankdir: js.UndefOr[TB | LR | BT | RL] = js.undefined
    
    /**
      * RequireJS config for resolving aliased modules.
      *
      * @default undefined
      */
    var requireConfig: js.UndefOr[String] = js.undefined
    
    /**
      * TypeScript config for resolving aliased modules - Either a path to a tsconfig file or an object containing the config.
      *
      * @default undefined
      */
    var tsConfig: js.UndefOr[String | js.Object] = js.undefined
    
    /**
      * Webpack config for resolving aliased modules.
      *
      * @default undefined
      */
    var webpackConfig: js.UndefOr[String] = js.undefined
  }
  object MadgeConfig {
    
    inline def apply(): MadgeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MadgeConfig]
    }
    
    extension [Self <: MadgeConfig](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      inline def setCyclicNodeColor(value: String): Self = StObject.set(x, "cyclicNodeColor", value.asInstanceOf[js.Any])
      
      inline def setCyclicNodeColorUndefined: Self = StObject.set(x, "cyclicNodeColor", js.undefined)
      
      inline def setDependencyFilter(value: /* id */ String => Boolean): Self = StObject.set(x, "dependencyFilter", js.Any.fromFunction1(value))
      
      inline def setDependencyFilterUndefined: Self = StObject.set(x, "dependencyFilter", js.undefined)
      
      inline def setDetectiveOptions(value: js.Object): Self = StObject.set(x, "detectiveOptions", value.asInstanceOf[js.Any])
      
      inline def setDetectiveOptionsUndefined: Self = StObject.set(x, "detectiveOptions", js.undefined)
      
      inline def setEdgeColor(value: String): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
      
      inline def setEdgeColorUndefined: Self = StObject.set(x, "edgeColor", js.undefined)
      
      inline def setExcludeRegExp(value: js.Array[js.RegExp]): Self = StObject.set(x, "excludeRegExp", value.asInstanceOf[js.Any])
      
      inline def setExcludeRegExpUndefined: Self = StObject.set(x, "excludeRegExp", js.undefined)
      
      inline def setExcludeRegExpVarargs(value: js.RegExp*): Self = StObject.set(x, "excludeRegExp", js.Array(value*))
      
      inline def setFileExtensions(value: js.Array[String]): Self = StObject.set(x, "fileExtensions", value.asInstanceOf[js.Any])
      
      inline def setFileExtensionsUndefined: Self = StObject.set(x, "fileExtensions", js.undefined)
      
      inline def setFileExtensionsVarargs(value: String*): Self = StObject.set(x, "fileExtensions", js.Array(value*))
      
      inline def setFontName(value: String): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setGraphVizOptions(value: js.Object): Self = StObject.set(x, "graphVizOptions", value.asInstanceOf[js.Any])
      
      inline def setGraphVizOptionsUndefined: Self = StObject.set(x, "graphVizOptions", js.undefined)
      
      inline def setGraphVizPath(value: String): Self = StObject.set(x, "graphVizPath", value.asInstanceOf[js.Any])
      
      inline def setGraphVizPathUndefined: Self = StObject.set(x, "graphVizPath", js.undefined)
      
      inline def setIncludeNpm(value: Boolean): Self = StObject.set(x, "includeNpm", value.asInstanceOf[js.Any])
      
      inline def setIncludeNpmUndefined: Self = StObject.set(x, "includeNpm", js.undefined)
      
      inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setNoDependencyColor(value: String): Self = StObject.set(x, "noDependencyColor", value.asInstanceOf[js.Any])
      
      inline def setNoDependencyColorUndefined: Self = StObject.set(x, "noDependencyColor", js.undefined)
      
      inline def setNodeColor(value: String): Self = StObject.set(x, "nodeColor", value.asInstanceOf[js.Any])
      
      inline def setNodeColorUndefined: Self = StObject.set(x, "nodeColor", js.undefined)
      
      inline def setNodeShape(value: String): Self = StObject.set(x, "nodeShape", value.asInstanceOf[js.Any])
      
      inline def setNodeShapeUndefined: Self = StObject.set(x, "nodeShape", js.undefined)
      
      inline def setNodeStyle(value: String): Self = StObject.set(x, "nodeStyle", value.asInstanceOf[js.Any])
      
      inline def setNodeStyleUndefined: Self = StObject.set(x, "nodeStyle", js.undefined)
      
      inline def setRankdir(value: TB | LR | BT | RL): Self = StObject.set(x, "rankdir", value.asInstanceOf[js.Any])
      
      inline def setRankdirUndefined: Self = StObject.set(x, "rankdir", js.undefined)
      
      inline def setRequireConfig(value: String): Self = StObject.set(x, "requireConfig", value.asInstanceOf[js.Any])
      
      inline def setRequireConfigUndefined: Self = StObject.set(x, "requireConfig", js.undefined)
      
      inline def setTsConfig(value: String | js.Object): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      inline def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
      
      inline def setWebpackConfig(value: String): Self = StObject.set(x, "webpackConfig", value.asInstanceOf[js.Any])
      
      inline def setWebpackConfigUndefined: Self = StObject.set(x, "webpackConfig", js.undefined)
    }
  }
  
  /**
    * A created Madge instance.
    */
  @js.native
  trait MadgeInstance extends StObject {
    
    /**
      * Return the modules that have circular dependencies.
      *
      * @returns An array of all modules that have circular dependencies.
      */
    def circular(): js.Array[js.Array[String]] = js.native
    
    /**
      * Return circular dependency graph.
      *
      * @returns An object with only circular dependencies.
      */
    def circularGraph(): MadgeModuleDependencyGraph = js.native
    
    /**
      * Return a list of modules that depends on a given module.
      *
      * @param id The ID of the module.
      * @returns An array of all modules that depend on the given module.
      */
    def depends(id: String): js.Array[String] = js.native
    
    /**
      * Return the module dependency graph as DOT output.
      *
      * @param circularOnly Only include circular dependencies.
      * @returns A Promise resolved with a DOT string representation of the module dependency graph
      */
    def dot(): js.Promise[String] = js.native
    def dot(circularOnly: Boolean): js.Promise[String] = js.native
    
    /**
      * Write dependency graph to image.
      *
      * @param imagePath The output path of the image.
      * @param circularOnly Only include circular dependencies.
      * @returns A Promise resolved with a full path to the written image.
      */
    def image(imagePath: String): js.Promise[String] = js.native
    def image(imagePath: String, circularOnly: Boolean): js.Promise[String] = js.native
    
    /**
      * Return a list of modules that have no dependencies.
      *
      * @returns An array of all modules that have no dependencies.
      */
    def leaves(): js.Array[String] = js.native
    
    /**
      * Return the module dependency graph as an object.
      *
      * @returns An object with all dependencies.
      */
    def obj(): MadgeModuleDependencyGraph = js.native
    
    /**
      * Return a list of modules that no one is depending on.
      *
      * @returns An array of all modules that no one is depending on.
      */
    def orphans(): js.Array[String] = js.native
    
    /**
      * Return Buffer with XML SVG representation of the dependency graph.
      *
      * @returns A Promise resolved with the XML SVG representation of the dependency graph as a Buffer.
      */
    def svg(): js.Promise[Buffer] = js.native
    
    /**
      * Return produced warnings.
      *
      * @returns An object of warnings.
      */
    def warnings(): MadgeWarnings = js.native
  }
  
  type MadgeModuleDependencyGraph = StringDictionary[js.Array[String]]
  
  /**
    * The path of a single file or directory, or an array of files/directories to read. A predefined tree can also be passed in as an object.
    */
  type MadgePath = String | js.Array[String] | js.Object
  
  trait MadgeWarnings extends StObject {
    
    var skipped: js.Array[String]
  }
  object MadgeWarnings {
    
    inline def apply(skipped: js.Array[String]): MadgeWarnings = {
      val __obj = js.Dynamic.literal(skipped = skipped.asInstanceOf[js.Any])
      __obj.asInstanceOf[MadgeWarnings]
    }
    
    extension [Self <: MadgeWarnings](x: Self) {
      
      inline def setSkipped(value: js.Array[String]): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      inline def setSkippedVarargs(value: String*): Self = StObject.set(x, "skipped", js.Array(value*))
    }
  }
}
