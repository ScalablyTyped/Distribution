package typings.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object components {
  
  type CreateViewModel = js.Function2[
    /* params */ typings.knockout.mod.components.ViewModelParams, 
    /* componentInfo */ typings.knockout.mod.components.ComponentInfo, 
    typings.knockout.mod.components.ViewModel
  ]
  
  type TemplateConfig = java.lang.String | js.Array[typings.std.Node] | typings.std.DocumentFragment | typings.knockout.mod.components.TemplateElement
  
  type ViewModelParams = org.scalablytyped.runtime.StringDictionary[js.Any]
}
