package typings.hapiHapi.anon

import typings.hapiHapi.libTypesRequestMod.ReqRef
import typings.joi.mod.ObjectSchema
import typings.joi.mod.Schema
import typings.joi.mod.ValidationOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[Refs /* <: ReqRef */] extends StObject {
  
  var options: js.UndefOr[ValidationOptions] = js.undefined
  
  var schema: js.UndefOr[
    (ObjectSchema[
      /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Rules'] */ js.Any
    ]) | (Record[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Rules'] */ js.Any, 
      Schema[Any]
    ])
  ] = js.undefined
}
object Options {
  
  inline def apply[Refs /* <: ReqRef */](): Options[Refs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[Refs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options[?], Refs /* <: ReqRef */] (val x: Self & Options[Refs]) extends AnyVal {
    
    inline def setOptions(value: ValidationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSchema(
      value: (ObjectSchema[
          /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Rules'] */ js.Any
        ]) | (Record[
          /* import warning: importer.ImportType#apply Failed type conversion: keyof @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Rules'] */ js.Any, 
          Schema[Any]
        ])
    ): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
