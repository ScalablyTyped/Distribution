package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.rootRefRootRefMod.RootRefProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootRefMod extends Shortcut {
  
  /**
    * ⚠️⚠️⚠️
    * If you want the DOM element of a Material-UI component check out
    * [FAQ: How can I access the DOM element?](https://mui.com/getting-started/faq/#how-can-i-access-the-dom-element)
    * first.
    *
    * This component uses `findDOMNode` which is deprecated in React.StrictMode.
    *
    * Helper component to allow attaching a ref to a
    * wrapped element to access the underlying DOM element.
    *
    * It's highly inspired by <https://github.com/facebook/react/issues/11401#issuecomment-340543801>.
    * For example:
    *
    * ```jsx
    * import React from 'react';
    * import RootRef from '@material-ui/core/RootRef';
    *
    * function MyComponent() {
    *   const domRef = React.useRef();
    *
    *   React.useEffect(() => {
    *     console.log(domRef.current); // DOM node
    *   }, []);
    *
    *   return (
    *     <RootRef rootRef={domRef}>
    *       <SomeChildComponent />
    *     </RootRef>
    *   );
    * }
    * ```
    *
    * @deprecated
    * API:
    *
    * - [RootRef API](https://mui.com/api/root-ref/)
    */
  @JSImport("@material-ui/core/RootRef", JSImport.Default)
  @js.native
  val default: ComponentType[RootRefProps[Any]] = js.native
  
  type _To = ComponentType[RootRefProps[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `rootRefMod.foo` */
  override def _to: ComponentType[RootRefProps[Any]] = default
}
