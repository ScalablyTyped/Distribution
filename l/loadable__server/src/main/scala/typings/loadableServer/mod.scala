package typings.loadableServer

import typings.loadableServer.anon.Default
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@loadable/server", "ChunkExtractor")
  @js.native
  open class ChunkExtractor protected () extends StObject {
    def this(options: ChunkExtractorOptions) = this()
    
    /**
      * Wrap your application in a `ChunkExtractorManager`
      */
    def collectChunks(/**
      * JSX element that will be wrapped in `ChunkExtractorManager`
      */
    element: Element): Element = js.native
    
    /**
      * Get css as a raw string for using directly within app (e.g. in custom AMP style tag)
      */
    def getCssString(): js.Promise[String] = js.native
    
    /**
      * Get inline style links as an array of React <link> elements (returns a promise).
      */
    def getInlineStyleElements(): js.Promise[js.Array[ReactElement]] = js.native
    def getInlineStyleElements(attr: js.Object): js.Promise[js.Array[ReactElement]] = js.native
    def getInlineStyleElements(attr: AttrFn): js.Promise[js.Array[ReactElement]] = js.native
    
    /**
      * Get inline style links as a string of <link> tags (returns a promise)
      */
    def getInlineStyleTags(): js.Promise[String] = js.native
    def getInlineStyleTags(attr: js.Object): js.Promise[String] = js.native
    def getInlineStyleTags(attr: AttrFn): js.Promise[String] = js.native
    
    /**
      * Get "prefetch" and "preload" links as an array of React `<link>` elements
      */
    def getLinkElements(): js.Array[ReactElement] = js.native
    def getLinkElements(attr: js.Object): js.Array[ReactElement] = js.native
    def getLinkElements(attr: AttrFn): js.Array[ReactElement] = js.native
    
    /**
      * Get "prefetch" and "preload" links as a string of `<link>` tags
      */
    def getLinkTags(): String = js.native
    def getLinkTags(attr: js.Object): String = js.native
    def getLinkTags(attr: AttrFn): String = js.native
    
    /**
      * Get required assets definition
      */
    def getMainAssets(): js.Array[Chunk] = js.native
    def getMainAssets(scriptType: String): js.Array[Chunk] = js.native
    
    /**
      * Returns the preload assets lists.
      */
    def getPreAssets(): js.Array[Chunk] = js.native
    
    /**
      * Get scripts as an array of React `<script>` elements.
      */
    def getScriptElements(): js.Array[ReactElement] = js.native
    def getScriptElements(attr: js.Object): js.Array[ReactElement] = js.native
    def getScriptElements(attr: AttrFn): js.Array[ReactElement] = js.native
    
    /**
      * Get scripts as a string of `<script>` tags
      */
    def getScriptTags(): String = js.native
    def getScriptTags(attr: js.Object): String = js.native
    def getScriptTags(attr: AttrFn): String = js.native
    
    /**
      * Get style links as an array of React `<link>` elements
      */
    def getStyleElements(): js.Array[ReactElement] = js.native
    def getStyleElements(attr: js.Object): js.Array[ReactElement] = js.native
    def getStyleElements(attr: AttrFn): js.Array[ReactElement] = js.native
    
    /**
      * Get style links as a string of `<link>` tags
      */
    def getStyleTags(): String = js.native
    def getStyleTags(attr: js.Object): String = js.native
    def getStyleTags(attr: AttrFn): String = js.native
    
    /**
      * Require the entrypoint of your application as a commonjs module.
      */
    def requireEntrypoint(): Default = js.native
    def requireEntrypoint(name: String): Default = js.native
  }
  
  @JSImport("@loadable/server", "ChunkExtractorManager")
  @js.native
  open class ChunkExtractorManager protected ()
    extends Component[ChunkExtractorManagerProps, js.Object, Any] {
    def this(props: ChunkExtractorManagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ChunkExtractorManagerProps, context: Any) = this()
  }
  
  type AttrFn = js.Function1[/* chunk */ Chunk, js.Object]
  
  trait Chunk extends StObject {
    
    var chunk: String
    
    var filename: String
    
    var linkType: String
    
    var path: String
    
    var scriptType: String
    
    var `type`: String
    
    var url: String
  }
  object Chunk {
    
    inline def apply(
      chunk: String,
      filename: String,
      linkType: String,
      path: String,
      scriptType: String,
      `type`: String,
      url: String
    ): Chunk = {
      val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scriptType = scriptType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
      
      inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setScriptType(value: String): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChunkExtractorManagerProps extends StObject {
    
    var extractor: ChunkExtractor
  }
  object ChunkExtractorManagerProps {
    
    inline def apply(extractor: ChunkExtractor): ChunkExtractorManagerProps = {
      val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChunkExtractorManagerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChunkExtractorManagerProps] (val x: Self) extends AnyVal {
      
      inline def setExtractor(value: ChunkExtractor): Self = StObject.set(x, "extractor", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.loadableServer.anon.statsFilestringentrypoint
    - typings.loadableServer.anon.statsobjectentrypointsstr
  */
  trait ChunkExtractorOptions extends StObject
  object ChunkExtractorOptions {
    
    inline def statsFilestringentrypoint(statsFile: String): typings.loadableServer.anon.statsFilestringentrypoint = {
      val __obj = js.Dynamic.literal(statsFile = statsFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.loadableServer.anon.statsFilestringentrypoint]
    }
    
    inline def statsobjectentrypointsstr(stats: js.Object): typings.loadableServer.anon.statsobjectentrypointsstr = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.loadableServer.anon.statsobjectentrypointsstr]
    }
  }
}
