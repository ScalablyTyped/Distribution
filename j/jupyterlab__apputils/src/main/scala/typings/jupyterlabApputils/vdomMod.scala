package typings.jupyterlabApputils

import typings.jupyterlabApputils.vdomMod.VDomRenderer.IModel
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.widgetMod.Widget.IOptions
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vdomMod {
  
  @JSImport("@jupyterlab/apputils/lib/vdom", "ReactWidget")
  @js.native
  /**
    * Construct a new widget.
    *
    * @param options - The options for initializing the widget.
    */
  abstract class ReactWidget () extends Widget {
    def this(options: IOptions) = this()
    
    /**
      * Render the content of this widget using the virtual DOM.
      *
      * This method will be called anytime the widget needs to be rendered, which
      * includes layout triggered rendering.
      *
      * Subclasses should define this method and return the root React nodes here.
      */
    /* protected */ def render(): ReactRenderElement | Null = js.native
    
    /**
      * Render the React nodes to the DOM.
      *
      * @returns a promise that resolves when the rendering is done.
      */
    var renderDOM: js.Any = js.native
    
    var renderPromise: js.UndefOr[js.Promise[Unit]] = js.native
  }
  /* static members */
  object ReactWidget {
    
    /**
      * Creates a new `ReactWidget` that renders a constant element.
      * @param element React element to render.
      */
    @JSImport("@jupyterlab/apputils/lib/vdom", "ReactWidget.create")
    @js.native
    def create(element: ReactRenderElement): ReactWidget = js.native
  }
  
  @JSImport("@jupyterlab/apputils/lib/vdom", "UseSignal")
  @js.native
  class UseSignal[SENDER, ARGS] protected ()
    extends Component[IUseSignalProps[SENDER, ARGS], IUseSignalState[SENDER, ARGS], js.Any] {
    def this(props: IUseSignalProps[SENDER, ARGS]) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MUseSignal(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MUseSignal(): Unit = js.native
    
    var slot: js.Any = js.native
  }
  
  @JSImport("@jupyterlab/apputils/lib/vdom", "VDomModel")
  @js.native
  class VDomModel () extends IModel {
    
    var _isDisposed: js.Any = js.native
    
    /**
      * Test whether the model is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MVDomModel: Boolean = js.native
    
    /**
      * A signal emitted when any model state changes.
      */
    @JSName("stateChanged")
    val stateChanged_VDomModel: Signal[this.type, Unit] = js.native
  }
  
  @JSImport("@jupyterlab/apputils/lib/vdom", "VDomRenderer")
  @js.native
  abstract class VDomRenderer[T /* <: IModel | Null */] protected () extends ReactWidget {
    /**
      * Create a new VDomRenderer
      */
    def this(model: T | Unit) = this()
    
    var _model: js.Any = js.native
    
    var _modelChanged: js.Any = js.native
    
    /**
      * Get the current model.
      */
    def model: T = js.native
    
    /**
      * A signal emitted when the model changes.
      */
    def modelChanged: ISignal[this.type, Unit] = js.native
    
    /**
      * Set the model and fire changed signals.
      */
    def model_=(newValue: T): Unit = js.native
  }
  object VDomRenderer {
    
    /**
      * An interface for a model to be used with vdom rendering.
      */
    @js.native
    trait IModel extends IDisposable {
      
      /**
        * A signal emitted when any model state changes.
        */
      val stateChanged: ISignal[this.type, Unit] = js.native
    }
    object IModel {
      
      @scala.inline
      def apply(dispose: () => Unit, isDisposed: Boolean, stateChanged: ISignal[IModel, Unit]): IModel = {
        val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any])
        __obj.asInstanceOf[IModel]
      }
      
      @scala.inline
      implicit class IModelMutableBuilder[Self <: IModel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStateChanged(value: ISignal[IModel, Unit]): Self = StObject.set(x, "stateChanged", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait IUseSignalProps[SENDER, ARGS] extends StObject {
    
    /**
      * Function mapping the last signal value or inital values to an element to render.
      *
      * Note: returns `React.ReactNode` as per
      * https://github.com/sw-yx/react-typescript-cheatsheet#higher-order-componentsrender-props
      */
    def children(): ReactNode = js.native
    def children(sender: SENDER): ReactNode = js.native
    def children(sender: SENDER, args: ARGS): ReactNode = js.native
    def children(sender: js.UndefOr[scala.Nothing], args: ARGS): ReactNode = js.native
    
    /**
      * Initial value to use for the args, used before the signal emits a value.
      * If not provided, initial args will be undefined.
      */
    var initialArgs: js.UndefOr[ARGS] = js.native
    
    /**
      * Initial value to use for the sender, used before the signal emits a value.
      * If not provided, initial sender will be undefined
      */
    var initialSender: js.UndefOr[SENDER] = js.native
    
    /**
      * Given the last signal value, should return whether to update the state or not.
      *
      * The default unconditionally returns `true`, so you only have to override if you want
      * to skip some updates.
      */
    var shouldUpdate: js.UndefOr[js.Function2[/* sender */ SENDER, /* args */ ARGS, Boolean]] = js.native
    
    /**
      * Phosphor signal to connect to.
      */
    var signal: ISignal[SENDER, ARGS] = js.native
  }
  
  @js.native
  trait IUseSignalState[SENDER, ARGS] extends StObject {
    
    var value: js.Tuple2[js.UndefOr[SENDER], js.UndefOr[ARGS]] = js.native
  }
  object IUseSignalState {
    
    @scala.inline
    def apply[SENDER, ARGS](value: js.Tuple2[js.UndefOr[SENDER], js.UndefOr[ARGS]]): IUseSignalState[SENDER, ARGS] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUseSignalState[SENDER, ARGS]]
    }
    
    @scala.inline
    implicit class IUseSignalStateMutableBuilder[Self <: IUseSignalState[_, _], SENDER, ARGS] (val x: Self with (IUseSignalState[SENDER, ARGS])) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Tuple2[js.UndefOr[SENDER], js.UndefOr[ARGS]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactRenderElement = js.Array[ReactElement] | ReactElement
}
