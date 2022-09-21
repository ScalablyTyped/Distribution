package typings.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[T] extends StObject {
  
  var `type`: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any
  ] = js.undefined
}
object `0` {
  
  inline def apply[T](): `0`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[T]]
  }
  
  extension [Self <: `0`[?], T](x: Self & `0`[T]) {
    
    inline def setType(value: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
