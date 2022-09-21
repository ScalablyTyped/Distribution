package typings.jasmine.jasmine

import org.scalablytyped.runtime.TopLevel
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
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ typings.jasmine.jasmineStrings.ObjectContaining & TopLevel[scala.Any], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ typings.jasmine.jasmineStrings.ObjectContaining & TopLevel[scala.Any]
    ]
  ] = js.native
}
