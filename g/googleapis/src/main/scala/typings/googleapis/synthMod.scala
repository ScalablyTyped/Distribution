package typings.googleapis

import typings.googleapis.downloadMod.ChangeSet
import typings.googleapis.googleapisStrings.feat
import typings.googleapis.googleapisStrings.fix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object synthMod {
  
  @JSImport("googleapis/build/src/generator/synth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Semverity extends StObject
  @JSImport("googleapis/build/src/generator/synth", "Semverity")
  @js.native
  object Semverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Semverity & Double] = js.native
    
    @js.native
    sealed trait MAJOR
      extends StObject
         with Semverity
    /* 3 */ val MAJOR: typings.googleapis.synthMod.Semverity.MAJOR & Double = js.native
    
    @js.native
    sealed trait MINOR
      extends StObject
         with Semverity
    /* 2 */ val MINOR: typings.googleapis.synthMod.Semverity.MINOR & Double = js.native
    
    @js.native
    sealed trait PATCH
      extends StObject
         with Semverity
    /* 1 */ val PATCH: typings.googleapis.synthMod.Semverity.PATCH & Double = js.native
  }
  
  inline def createChangelog(changeSets: js.Array[ChangeSet]): typings.googleapis.anon.Changelog = ^.asInstanceOf[js.Dynamic].applyDynamic("createChangelog")(changeSets.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.anon.Changelog]
  
  inline def getPrefix(semverity: Semverity): fix | feat = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefix")(semverity.asInstanceOf[js.Any]).asInstanceOf[fix | feat]
  
  inline def getSemverity(changeSets: js.Array[ChangeSet]): Semverity = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemverity")(changeSets.asInstanceOf[js.Any]).asInstanceOf[Semverity]
  
  inline def synth(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("synth")().asInstanceOf[js.Promise[Unit]]
  inline def synth(options: SynthOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("synth")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait Changelog extends StObject {
    
    var description: String
    
    var semverity: Semverity
    
    var title: String
  }
  object Changelog {
    
    inline def apply(description: String, semverity: Semverity, title: String): Changelog = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], semverity = semverity.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changelog]
    }
    
    extension [Self <: Changelog](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setSemverity(value: Semverity): Self = StObject.set(x, "semverity", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait SynthOptions extends StObject {
    
    var useCache: js.UndefOr[Boolean] = js.undefined
  }
  object SynthOptions {
    
    inline def apply(): SynthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SynthOptions]
    }
    
    extension [Self <: SynthOptions](x: Self) {
      
      inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
      
      inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
    }
  }
}
