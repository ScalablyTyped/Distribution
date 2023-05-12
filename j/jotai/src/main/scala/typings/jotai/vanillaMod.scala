package typings.jotai

import typings.jotai.anon.Devgetatomstate
import typings.jotai.anon.Devgetmounted
import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.PrimitiveAtom
import typings.jotai.vanillaAtomMod.Read
import typings.jotai.vanillaAtomMod.SetAtom
import typings.jotai.vanillaAtomMod.WithInitialValue
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaAtomMod.Write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaMod {
  
  @JSImport("jotai/vanilla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atom[Value](initialValue: Value): PrimitiveAtom[Value] & WithInitialValue[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("atom")(initialValue.asInstanceOf[js.Any]).asInstanceOf[PrimitiveAtom[Value] & WithInitialValue[Value]]
  inline def atom[Value](read: Read[Value, scala.Nothing]): Atom_[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("atom")(read.asInstanceOf[js.Any]).asInstanceOf[Atom_[Value]]
  inline def atom[Value, Args /* <: js.Array[Any] */, Result](initialValue: Value, write: Write[Args, Result]): (WritableAtom[Value, Args, Result]) & WithInitialValue[Value] = (^.asInstanceOf[js.Dynamic].applyDynamic("atom")(initialValue.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[(WritableAtom[Value, Args, Result]) & WithInitialValue[Value]]
  inline def atom[Value, Args /* <: js.Array[Any] */, Result](read: Read[Value, SetAtom[Args, Result]], write: Write[Args, Result]): WritableAtom[Value, Args, Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("atom")(read.asInstanceOf[js.Any], write.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Value, Args, Result]]
  
  inline def createStore(): Devgetatomstate | Devgetmounted = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")().asInstanceOf[Devgetatomstate | Devgetmounted]
  
  inline def getDefaultStore(): Devgetatomstate | Devgetmounted = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStore")().asInstanceOf[Devgetatomstate | Devgetmounted]
}
