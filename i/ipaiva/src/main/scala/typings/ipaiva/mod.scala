package typings.ipaiva

import org.scalablytyped.runtime.StringDictionary
import typings.ipaiva.anon.Url
import typings.ipaiva.ipaivaStrings.audio
import typings.ipaiva.ipaivaStrings.completed
import typings.ipaiva.ipaivaStrings.image
import typings.ipaiva.ipaivaStrings.video
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object library {
    
    @JSImport("ipaiva", "library")
    @js.native
    val ^ : js.Any = js.native
    
    inline def onDidPick(callback: OnDidPickCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDidPick")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onDidPick(callback: OnDidPickCallback, option: OnDidPickOption): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onDidPick")(callback.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    type OnDidPickCallback = js.Function1[/* callback */ Url, Unit]
    
    trait OnDidPickOption extends StObject {
      
      var `type`: image | video | audio
    }
    object OnDidPickOption {
      
      inline def apply(`type`: image | video | audio): OnDidPickOption = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[OnDidPickOption]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OnDidPickOption] (val x: Self) extends AnyVal {
        
        inline def setType(value: image | video | audio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object textEditor {
    
    @JSImport("ipaiva", "textEditor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(elem: HTMLElement): TextEditor_ = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(elem.asInstanceOf[js.Any]).asInstanceOf[TextEditor_]
    inline def create(elem: HTMLElement, options: TextEditorOptions): TextEditor_ = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(elem.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TextEditor_]
  }
  
  @JSImport("ipaiva", "version")
  @js.native
  val version: String = js.native
  
  object window {
    
    @JSImport("ipaiva", "window")
    @js.native
    val ^ : js.Any = js.native
    
    inline def showInformationMessage(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showInformationMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object Crate {
    
    trait Design extends StObject {
      
      var controls: js.UndefOr[DesignControls] = js.undefined
      
      var data: js.UndefOr[NodeData] = js.undefined
      
      var dependencies: js.UndefOr[Any] = js.undefined
      
      /**
        * extract options
        *
        * @param options DesignOptions
        */
      var extractOptions: js.UndefOr[js.Function1[/* options */ DesignOptions, DesignOptions]] = js.undefined
      
      var main: js.UndefOr[String] = js.undefined
      
      var nodeEvents: js.UndefOr[DesignNodeEvents] = js.undefined
      
      var options: js.UndefOr[DesignOptions] = js.undefined
      
      var overrideRenderProperties: js.UndefOr[js.Function1[/* props */ Props, Props]] = js.undefined
      
      var preCreate: js.UndefOr[js.Function1[/* option */ PreCreateOption, PreCreateOption]] = js.undefined
      
      var styleSchema: js.UndefOr[DesignStyleSchema] = js.undefined
      
      var transformer: js.UndefOr[Transformer] = js.undefined
    }
    object Design {
      
      inline def apply(): Design = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Design]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Design] (val x: Self) extends AnyVal {
        
        inline def setControls(value: DesignControls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
        
        inline def setControlsVarargs(value: DesignControl*): Self = StObject.set(x, "controls", js.Array(value*))
        
        inline def setData(value: NodeData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setDependencies(value: Any): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
        
        inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
        
        inline def setExtractOptions(value: /* options */ DesignOptions => DesignOptions): Self = StObject.set(x, "extractOptions", js.Any.fromFunction1(value))
        
        inline def setExtractOptionsUndefined: Self = StObject.set(x, "extractOptions", js.undefined)
        
        inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
        
        inline def setNodeEvents(value: DesignNodeEvents): Self = StObject.set(x, "nodeEvents", value.asInstanceOf[js.Any])
        
        inline def setNodeEventsUndefined: Self = StObject.set(x, "nodeEvents", js.undefined)
        
        inline def setOptions(value: DesignOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setOverrideRenderProperties(value: /* props */ Props => Props): Self = StObject.set(x, "overrideRenderProperties", js.Any.fromFunction1(value))
        
        inline def setOverrideRenderPropertiesUndefined: Self = StObject.set(x, "overrideRenderProperties", js.undefined)
        
        inline def setPreCreate(value: /* option */ PreCreateOption => PreCreateOption): Self = StObject.set(x, "preCreate", js.Any.fromFunction1(value))
        
        inline def setPreCreateUndefined: Self = StObject.set(x, "preCreate", js.undefined)
        
        inline def setStyleSchema(value: DesignStyleSchema): Self = StObject.set(x, "styleSchema", value.asInstanceOf[js.Any])
        
        inline def setStyleSchemaUndefined: Self = StObject.set(x, "styleSchema", js.undefined)
        
        inline def setTransformer(value: Transformer): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
        
        inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
      }
    }
    
    trait DesignControl extends StObject {
      
      var name: String
      
      var render: Any
    }
    object DesignControl {
      
      inline def apply(name: String, render: Any): DesignControl = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
        __obj.asInstanceOf[DesignControl]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DesignControl] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRender(value: Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      }
    }
    
    type DesignControls = js.Array[DesignControl]
    
    /**
      * 节点事件
      *
      * click | dblclick
      */
    trait DesignNodeEvents extends StObject {
      
      def dblclick(e: MouseEvent, node: Node): Unit
    }
    object DesignNodeEvents {
      
      inline def apply(dblclick: (MouseEvent, Node) => Unit): DesignNodeEvents = {
        val __obj = js.Dynamic.literal(dblclick = js.Any.fromFunction2(dblclick))
        __obj.asInstanceOf[DesignNodeEvents]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DesignNodeEvents] (val x: Self) extends AnyVal {
        
        inline def setDblclick(value: (MouseEvent, Node) => Unit): Self = StObject.set(x, "dblclick", js.Any.fromFunction2(value))
      }
    }
    
    trait DesignOptions extends StObject {
      
      var attrs: js.UndefOr[StringDictionary[Any]] = js.undefined
      
      var hasMask: js.UndefOr[Boolean] = js.undefined
      
      var height: js.UndefOr[Double] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object DesignOptions {
      
      inline def apply(): DesignOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DesignOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DesignOptions] (val x: Self) extends AnyVal {
        
        inline def setAttrs(value: StringDictionary[Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
        
        inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
        
        inline def setHasMask(value: Boolean): Self = StObject.set(x, "hasMask", value.asInstanceOf[js.Any])
        
        inline def setHasMaskUndefined: Self = StObject.set(x, "hasMask", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    type DesignStyleSchema = Any
    
    trait Node extends StObject {
      
      def find(selector: String): HTMLElement | Null
      
      def inactive(): Node
      
      def update(attrs: NodeUpdateAttrs): Node
    }
    object Node {
      
      inline def apply(find: String => HTMLElement | Null, inactive: () => Node, update: NodeUpdateAttrs => Node): Node = {
        val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), inactive = js.Any.fromFunction0(inactive), update = js.Any.fromFunction1(update))
        __obj.asInstanceOf[Node]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
        
        inline def setFind(value: String => HTMLElement | Null): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
        
        inline def setInactive(value: () => Node): Self = StObject.set(x, "inactive", js.Any.fromFunction0(value))
        
        inline def setUpdate(value: NodeUpdateAttrs => Node): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      }
    }
    
    type NodeData = StringDictionary[String | Double | Boolean | js.Object]
    
    /**
      * Node
      */
    type NodeUpdateAttrs = StringDictionary[Any]
    
    trait Package extends StObject {
      
      var name: String
      
      var version: String
    }
    object Package {
      
      inline def apply(name: String, version: String): Package = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
        __obj.asInstanceOf[Package]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Package] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      }
    }
    
    type PreCreateOption = StringDictionary[Any]
    
    type Props = Record[String, Any]
    
    trait Render extends StObject
    
    trait Transformer extends StObject {
      
      var keepRatio: js.UndefOr[Boolean] = js.undefined
      
      var minHeight: js.UndefOr[Double] = js.undefined
      
      var minWidth: js.UndefOr[Double] = js.undefined
      
      var zoomable: js.UndefOr[String] = js.undefined
    }
    object Transformer {
      
      inline def apply(): Transformer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Transformer]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Transformer] (val x: Self) extends AnyVal {
        
        inline def setKeepRatio(value: Boolean): Self = StObject.set(x, "keepRatio", value.asInstanceOf[js.Any])
        
        inline def setKeepRatioUndefined: Self = StObject.set(x, "keepRatio", js.undefined)
        
        inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
        
        inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
        
        inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
        
        inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
        
        inline def setZoomable(value: String): Self = StObject.set(x, "zoomable", value.asInstanceOf[js.Any])
        
        inline def setZoomableUndefined: Self = StObject.set(x, "zoomable", js.undefined)
      }
    }
  }
  
  trait TextEditorOptions extends StObject {
    
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object TextEditorOptions {
    
    inline def apply(): TextEditorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextEditorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextEditorOptions] (val x: Self) extends AnyVal {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  trait TextEditor_ extends StObject {
    
    @JSName("on")
    def on_completed(event: completed, fn: js.Function1[/* content */ String, Unit]): this.type
  }
  object TextEditor_ {
    
    inline def apply(on: (completed, js.Function1[/* content */ String, Unit]) => TextEditor_): TextEditor_ = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[TextEditor_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextEditor_] (val x: Self) extends AnyVal {
      
      inline def setOn(value: (completed, js.Function1[/* content */ String, Unit]) => TextEditor_): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
