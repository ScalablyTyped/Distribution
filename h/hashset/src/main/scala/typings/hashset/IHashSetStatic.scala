package typings.hashset

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.hashtable.IHashtableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHashSetStatic
  extends StObject
     with Instantiable0[IHashSet[js.Object]]
     with Instantiable1[
      (/* hashCode */ js.Function1[/* value */ js.Object, js.Any]) | (/* options */ IHashtableOptions[js.Object]), 
      IHashSet[js.Object]
    ]
     with Instantiable2[
      (/* hashCode */ js.Function1[/* value */ js.Object, js.Any]) | (/* hashCode */ Unit), 
      /* equals */ js.Function2[/* value1 */ js.Object, /* value2 */ js.Object, Boolean], 
      IHashSet[js.Object]
    ]
