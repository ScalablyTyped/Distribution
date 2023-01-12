package typings.kahootJsUpdated.anon

import typings.kahootJsUpdated.kahootJsUpdatedBooleans.`false`
import typings.kahootJsUpdated.mod.JoinResponse
import typings.kahootJsUpdated.mod.Kahoot
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var client: Kahoot
  
  var event: ReturnType[
    js.Function3[
      /* pin */ String | Double, 
      /* name */ String, 
      /* team */ js.UndefOr[js.Array[String] | `false`], 
      js.Promise[JoinResponse]
    ]
  ]
}
object Client {
  
  inline def apply(
    client: Kahoot,
    event: ReturnType[
      js.Function3[
        /* pin */ String | Double, 
        /* name */ String, 
        /* team */ js.UndefOr[js.Array[String] | `false`], 
        js.Promise[JoinResponse]
      ]
    ]
  ): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    inline def setClient(value: Kahoot): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setEvent(
      value: ReturnType[
          js.Function3[
            /* pin */ String | Double, 
            /* name */ String, 
            /* team */ js.UndefOr[js.Array[String] | `false`], 
            js.Promise[JoinResponse]
          ]
        ]
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
