package typings.iobroker.objectsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ioBroker {
  
  // For all objects that are exposed to the user we need to tone the strictness down.
  // Otherwise, every operation on objects becomes a pain to work with
  type Object = typings.iobroker.objectsMod.global.ioBroker.AnyObject with typings.iobroker.anon.Common
  
  // In set[Foreign]Object[NotExists] methods, the ID and acl of the object is optional
  type SettableObject = typings.iobroker.objectsMod.global.ioBroker.SettableObjectWorker[typings.iobroker.objectsMod.global.ioBroker.AnyObject]
  
  type SettableObjectWorker[T] = (typings.std.Omit[T, typings.iobroker.iobrokerStrings._id | typings.iobroker.iobrokerStrings.acl]) with typings.iobroker.anon.Acl[T]
  
  type StringOrTranslated = java.lang.String | typings.iobroker.anon.langinLanguagesstring
  
  type WelcomeScreenEntry = java.lang.String | typings.iobroker.anon.Color
}
