package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectContaining[T]
  extends StObject
     with AsymmetricMatcher[T]
     with _Expected[T] {
  
  var `new`: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? any} */ /* sample */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]:? any} */ js.Any
    ]
  ] = js.native
}
