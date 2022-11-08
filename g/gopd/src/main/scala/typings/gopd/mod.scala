package typings.gopd

import org.scalablytyped.runtime.Shortcut
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gopd", JSImport.Namespace)
  @js.native
  val ^ : js.UndefOr[
    (js.Function2[
      /* target */ Any, 
      /* propertyKey */ PropertyKey, 
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.PropertyKey extends keyof any ? std.TypedPropertyDescriptor<any[std.PropertyKey]> : std.PropertyDescriptor */ js.Any
      ]
    ]) | Null
  ] = js.native
  
  type _To = js.UndefOr[
    (js.Function2[
      /* target */ Any, 
      /* propertyKey */ PropertyKey, 
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.PropertyKey extends keyof any ? std.TypedPropertyDescriptor<any[std.PropertyKey]> : std.PropertyDescriptor */ js.Any
      ]
    ]) | Null
  ]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.UndefOr[
    (js.Function2[
      /* target */ Any, 
      /* propertyKey */ PropertyKey, 
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.PropertyKey extends keyof any ? std.TypedPropertyDescriptor<any[std.PropertyKey]> : std.PropertyDescriptor */ js.Any
      ]
    ]) | Null
  ] = ^
}
