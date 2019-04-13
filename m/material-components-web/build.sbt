organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-8a9580"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-7ea94d",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-021bff",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-4c2c3c",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-7f00a7",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-285a7a",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-782a94",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-63c277",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-bfbd2f",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-e656c8",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-3930e2",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-306a6e",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-53c30e",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-a63751",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-f357dd",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-3b3ab5",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-a4ad7a",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-b0b70f",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-7da596",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-5b75f6",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-bf5492",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-54830b",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-8cb39f",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-1ecc94",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-53199b",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-433d10",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        