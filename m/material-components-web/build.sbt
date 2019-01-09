organization := "org.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180511Z-c6892b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180511Z-4f6983",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-45ced4",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180511Z-bb79af",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180511Z-3def24",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180511Z-211945",
  "org.scalablytyped" %%% "material__drawer" % "0.35-dt-20180511Z-bac0b2",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-ccd185",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180511Z-67545b",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180511Z-e6b19e",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180511Z-e021fd",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-1fb1a0",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180511Z-c37f2e",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180809Z-10e4dc",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-366683",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180511Z-f8d7e4",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-4afa95",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180511Z-e4b048",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-0179cb",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180511Z-b6ba4c",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180511Z-93789b",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180511Z-8efa04",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180511Z-288d3a",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180511Z-456297",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180511Z-5c7f57",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        