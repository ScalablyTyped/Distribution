package typings.ionicons.distTypesStencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentInterface
  extends StObject
     with /* prop */ StringDictionary[Any] {
  
  /**
    * The component has loaded and has already rendered.
    *
    * Updating data in this method will cause the
    * component to re-render.
    *
    * componentDidLoad will only be called once.
    */
  var componentDidLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var componentDidRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * The component has just re-rendered.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the
    * first render.
    */
  var componentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * A `@Prop` or `@State` property changed and a rerender is about to be requested.
    *
    * Called multiple times throughout the life of
    * the component as its properties change.
    *
    * componentShouldUpdate is not called on the first render.
    */
  var componentShouldUpdate: js.UndefOr[
    js.Function3[/* newVal */ Any, /* oldVal */ Any, /* propName */ String, Boolean | Unit]
  ] = js.undefined
  
  /**
    * The component is about to load and it has not
    * rendered yet.
    *
    * This is the best place to make any data updates
    * before the first render.
    *
    * componentWillLoad will only be called once.
    */
  var componentWillLoad: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  
  var componentWillRender: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  var componentWillUpdate: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  
  var connectedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var disconnectedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var render: js.UndefOr[js.Function0[Any]] = js.undefined
}
object ComponentInterface {
  
  inline def apply(): ComponentInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentInterface]
  }
  
  extension [Self <: ComponentInterface](x: Self) {
    
    inline def setComponentDidLoad(value: () => Unit): Self = StObject.set(x, "componentDidLoad", js.Any.fromFunction0(value))
    
    inline def setComponentDidLoadUndefined: Self = StObject.set(x, "componentDidLoad", js.undefined)
    
    inline def setComponentDidRender(value: () => Unit): Self = StObject.set(x, "componentDidRender", js.Any.fromFunction0(value))
    
    inline def setComponentDidRenderUndefined: Self = StObject.set(x, "componentDidRender", js.undefined)
    
    inline def setComponentDidUpdate(value: () => Unit): Self = StObject.set(x, "componentDidUpdate", js.Any.fromFunction0(value))
    
    inline def setComponentDidUpdateUndefined: Self = StObject.set(x, "componentDidUpdate", js.undefined)
    
    inline def setComponentShouldUpdate(value: (/* newVal */ Any, /* oldVal */ Any, /* propName */ String) => Boolean | Unit): Self = StObject.set(x, "componentShouldUpdate", js.Any.fromFunction3(value))
    
    inline def setComponentShouldUpdateUndefined: Self = StObject.set(x, "componentShouldUpdate", js.undefined)
    
    inline def setComponentWillLoad(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "componentWillLoad", js.Any.fromFunction0(value))
    
    inline def setComponentWillLoadUndefined: Self = StObject.set(x, "componentWillLoad", js.undefined)
    
    inline def setComponentWillRender(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "componentWillRender", js.Any.fromFunction0(value))
    
    inline def setComponentWillRenderUndefined: Self = StObject.set(x, "componentWillRender", js.undefined)
    
    inline def setComponentWillUpdate(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "componentWillUpdate", js.Any.fromFunction0(value))
    
    inline def setComponentWillUpdateUndefined: Self = StObject.set(x, "componentWillUpdate", js.undefined)
    
    inline def setConnectedCallback(value: () => Unit): Self = StObject.set(x, "connectedCallback", js.Any.fromFunction0(value))
    
    inline def setConnectedCallbackUndefined: Self = StObject.set(x, "connectedCallback", js.undefined)
    
    inline def setDisconnectedCallback(value: () => Unit): Self = StObject.set(x, "disconnectedCallback", js.Any.fromFunction0(value))
    
    inline def setDisconnectedCallbackUndefined: Self = StObject.set(x, "disconnectedCallback", js.undefined)
    
    inline def setRender(value: () => Any): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
