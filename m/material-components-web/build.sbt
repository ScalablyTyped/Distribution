organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-6cb933"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-46a14d",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-5b182d",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-c71a28",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-a45e80",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-a0ae8d",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-2ad286",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-28d82e",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-236b70",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-d2ad10",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-5edf80",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-25429a",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-c6e576",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-adfde5",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-9036a0",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-e9fbc2",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-33c34b",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-8fc952",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-ad4108",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-0d4143",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-94c484",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-8e4fd8",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-4985b4",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-179abf",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-88a197",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-9258fe",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        