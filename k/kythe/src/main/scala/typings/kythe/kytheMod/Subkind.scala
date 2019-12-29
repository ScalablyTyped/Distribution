package typings.kythe.kytheMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Subkind extends js.Object

@JSImport("kythe", "Subkind")
@js.native
object Subkind extends js.Object {
  @js.native
  sealed trait CATEGORY extends Subkind
  
  @js.native
  sealed trait CLASS extends Subkind
  
  @js.native
  sealed trait CONSTRUCTOR extends Subkind
  
  @js.native
  sealed trait DESTRUCTOR extends Subkind
  
  @js.native
  sealed trait ENUM extends Subkind
  
  @js.native
  sealed trait ENUM_CLASS extends Subkind
  
  @js.native
  sealed trait FIELD extends Subkind
  
  @js.native
  sealed trait IMPLICIT extends Subkind
  
  @js.native
  sealed trait IMPORT extends Subkind
  
  @js.native
  sealed trait INITIALIZER extends Subkind
  
  @js.native
  sealed trait LOCAL extends Subkind
  
  @js.native
  sealed trait LOCAL_PARAMETER extends Subkind
  
  @js.native
  sealed trait METHOD extends Subkind
  
  @js.native
  sealed trait NAMESPACE extends Subkind
  
  @js.native
  sealed trait STRUCT extends Subkind
  
  @js.native
  sealed trait TYPE extends Subkind
  
  @js.native
  sealed trait UNION extends Subkind
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Subkind with String] = js.native
  /* "category" */ @js.native
  object CATEGORY extends TopLevel[CATEGORY with String]
  
  /* "class" */ @js.native
  object CLASS extends TopLevel[CLASS with String]
  
  /* "constructor" */ @js.native
  object CONSTRUCTOR extends TopLevel[CONSTRUCTOR with String]
  
  /* "destructor" */ @js.native
  object DESTRUCTOR extends TopLevel[DESTRUCTOR with String]
  
  /* "enum" */ @js.native
  object ENUM extends TopLevel[ENUM with String]
  
  /* "enumClass" */ @js.native
  object ENUM_CLASS extends TopLevel[ENUM_CLASS with String]
  
  /* "field" */ @js.native
  object FIELD extends TopLevel[FIELD with String]
  
  /* "implicit" */ @js.native
  object IMPLICIT extends TopLevel[IMPLICIT with String]
  
  /* "import" */ @js.native
  object IMPORT extends TopLevel[IMPORT with String]
  
  /* "initializer" */ @js.native
  object INITIALIZER extends TopLevel[INITIALIZER with String]
  
  /* "local" */ @js.native
  object LOCAL extends TopLevel[LOCAL with String]
  
  /* "local/parameter" */ @js.native
  object LOCAL_PARAMETER extends TopLevel[LOCAL_PARAMETER with String]
  
  /* "method" */ @js.native
  object METHOD extends TopLevel[METHOD with String]
  
  /* "namespace" */ @js.native
  object NAMESPACE extends TopLevel[NAMESPACE with String]
  
  /* "struct" */ @js.native
  object STRUCT extends TopLevel[STRUCT with String]
  
  /* "type" */ @js.native
  object TYPE extends TopLevel[TYPE with String]
  
  /* "union" */ @js.native
  object UNION extends TopLevel[UNION with String]
  
}

