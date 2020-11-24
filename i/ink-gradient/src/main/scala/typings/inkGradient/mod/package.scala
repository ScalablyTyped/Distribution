package typings.inkGradient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GradientProps = (typings.inkGradient.mod.XOR[typings.inkGradient.mod.PropsName, typings.inkGradient.mod.PropsColor]) with typings.inkGradient.anon.Children
  
  // This needs to be updated when TypeScript enhances their support for mutual
  // exclusivity in properties. This edit I made will now throw errors when
  // a user gives both of the mutually exclusive props.
  type Without[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, keyof U> ]:? never}
    */ typings.inkGradient.inkGradientStrings.Without with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type XOR[T, U] = T | U | ((typings.inkGradient.mod.Without[T, U]) with U) | ((typings.inkGradient.mod.Without[U, T]) with T)
}
