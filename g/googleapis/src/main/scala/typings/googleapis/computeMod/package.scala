package typings.googleapis.computeMod

import typings.googleapis.alphaMod.computeAlpha.Compute
import typings.googleapis.alphaMod.computeAlpha.Options
import typings.googleapis.computeMod.^
import typings.googleapis.googleapisStrings.alpha
import typings.googleapis.googleapisStrings.beta
import typings.googleapis.googleapisStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def compute(options: Options): Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(options.asInstanceOf[js.Any]).asInstanceOf[Compute]
inline def compute(options: typings.googleapis.betaMod.computeBeta.Options): typings.googleapis.betaMod.computeBeta.Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.betaMod.computeBeta.Compute]
inline def compute(options: typings.googleapis.computeV1Mod.computeV1.Options): typings.googleapis.computeV1Mod.computeV1.Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(options.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.computeV1Mod.computeV1.Compute]

inline def compute_alpha(version: alpha): Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(version.asInstanceOf[js.Any]).asInstanceOf[Compute]

inline def compute_beta(version: beta): typings.googleapis.betaMod.computeBeta.Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.betaMod.computeBeta.Compute]

inline def compute_v1(version: v1): typings.googleapis.computeV1Mod.computeV1.Compute = ^.asInstanceOf[js.Dynamic].applyDynamic("compute")(version.asInstanceOf[js.Any]).asInstanceOf[typings.googleapis.computeV1Mod.computeV1.Compute]
