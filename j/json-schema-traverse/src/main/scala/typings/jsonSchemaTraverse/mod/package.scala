package typings.jsonSchemaTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type TraverseCallback = typings.jsonSchemaTraverse.mod.TraverseCallbackDef | typings.jsonSchemaTraverse.anon.Post
  
  type TraverseCallbackDef = js.Function7[
    /* schema */ js.Object, 
    /* jsonPtr */ java.lang.String, 
    /* rootSchema */ js.Object, 
    /* parentJsonPtr */ java.lang.String, 
    /* parentKeyword */ java.lang.String, 
    /* parentSchema */ js.Object, 
    /* keyIndex */ java.lang.String | scala.Double, 
    scala.Unit
  ]
}
