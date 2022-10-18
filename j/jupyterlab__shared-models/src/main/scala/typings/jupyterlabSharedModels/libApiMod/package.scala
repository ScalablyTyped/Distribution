package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabSharedModels.anon.Action
import typings.jupyterlabSharedModels.anon.Delete
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Delta[T] = js.Array[Delete[T]]

type MapChange = Map[String, Action]
