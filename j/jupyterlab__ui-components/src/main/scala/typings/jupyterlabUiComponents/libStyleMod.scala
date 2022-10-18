package typings.jupyterlabUiComponents

import typings.jupyterlabUiComponents.libStyleIconMod.LabIconStyle.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStyleMod {
  
  object LabIconStyle {
    
    @JSImport("@jupyterlab/ui-components/lib/style", "LabIconStyle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def styleClass(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("styleClass")().asInstanceOf[String]
    inline def styleClass(props: IProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("styleClass")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
