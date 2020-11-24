package typings.kythe.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Subkind extends js.Object
@JSImport("kythe", "Subkind")
@js.native
object Subkind extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Subkind with String] = js.native
  
  @js.native
  sealed trait CATEGORY extends Subkind
  /* "category" */ @js.native
  object CATEGORY extends TopLevel[CATEGORY with String]
  
  @js.native
  sealed trait CLASS extends Subkind
  /* "class" */ @js.native
  object CLASS extends TopLevel[CLASS with String]
  
  @js.native
  sealed trait CONSTRUCTOR extends Subkind
  /* "constructor" */ @js.native
  object CONSTRUCTOR extends TopLevel[CONSTRUCTOR with String]
  
  @js.native
  sealed trait DESTRUCTOR extends Subkind
  /* "destructor" */ @js.native
  object DESTRUCTOR extends TopLevel[DESTRUCTOR with String]
  
  @js.native
  sealed trait ENUM extends Subkind
  /* "enum" */ @js.native
  object ENUM extends TopLevel[ENUM with String]
  
  @js.native
  sealed trait ENUM_CLASS extends Subkind
  /* "enumClass" */ @js.native
  object ENUM_CLASS extends TopLevel[ENUM_CLASS with String]
  
  @js.native
  sealed trait FIELD extends Subkind
  /* "field" */ @js.native
  object FIELD extends TopLevel[FIELD with String]
  
  @js.native
  sealed trait IMPLICIT extends Subkind
  /* "implicit" */ @js.native
  object IMPLICIT extends TopLevel[IMPLICIT with String]
  
  @js.native
  sealed trait IMPORT extends Subkind
  /* "import" */ @js.native
  object IMPORT extends TopLevel[IMPORT with String]
  
  @js.native
  sealed trait INITIALIZER extends Subkind
  /* "initializer" */ @js.native
  object INITIALIZER extends TopLevel[INITIALIZER with String]
  
  @js.native
  sealed trait LOCAL extends Subkind
  /* "local" */ @js.native
  object LOCAL extends TopLevel[LOCAL with String]
  
  @js.native
  sealed trait LOCAL_PARAMETER extends Subkind
  /* "local/parameter" */ @js.native
  object LOCAL_PARAMETER extends TopLevel[LOCAL_PARAMETER with String]
  
  @js.native
  sealed trait METHOD extends Subkind
  /* "method" */ @js.native
  object METHOD extends TopLevel[METHOD with String]
  
  @js.native
  sealed trait NAMESPACE extends Subkind
  /* "namespace" */ @js.native
  object NAMESPACE extends TopLevel[NAMESPACE with String]
  
  @js.native
  sealed trait STRUCT extends Subkind
  /* "struct" */ @js.native
  object STRUCT extends TopLevel[STRUCT with String]
  
  @js.native
  sealed trait TYPE extends Subkind
  /* "type" */ @js.native
  object TYPE extends TopLevel[TYPE with String]
  
  @js.native
  sealed trait UNION extends Subkind
  /* "union" */ @js.native
  object UNION extends TopLevel[UNION with String]
}
