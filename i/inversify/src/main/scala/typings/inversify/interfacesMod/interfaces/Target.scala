package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends StObject {
  
  def getCustomTags(): js.Array[Metadata] | Null = js.native
  
  def getNamedTag(): Metadata | Null = js.native
  
  def hasTag(key: String): Boolean = js.native
  def hasTag(key: js.Symbol): Boolean = js.native
  def hasTag(key: Double): Boolean = js.native
  
  var id: Double = js.native
  
  def isArray(): Boolean = js.native
  
  def isNamed(): Boolean = js.native
  
  def isOptional(): Boolean = js.native
  
  def isTagged(): Boolean = js.native
  
  def matchesArray(name: ServiceIdentifier[js.Any]): Boolean = js.native
  
  def matchesNamedTag(name: String): Boolean = js.native
  
  def matchesTag(key: String): js.Function1[/* value */ js.Any, Boolean] = js.native
  def matchesTag(key: js.Symbol): js.Function1[/* value */ js.Any, Boolean] = js.native
  def matchesTag(key: Double): js.Function1[/* value */ js.Any, Boolean] = js.native
  
  var metadata: js.Array[Metadata] = js.native
  
  var name: QueryableString = js.native
  
  var serviceIdentifier: ServiceIdentifier[js.Any] = js.native
  
  var `type`: TargetType = js.native
}
