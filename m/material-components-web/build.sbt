organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-4d2e32"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-6eae5c",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-109fda",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190313Z-e5736b",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-c9fb23",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190313Z-51bcf9",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190313Z-0fd505",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-5c89ef",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-b934b9",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190313Z-73a036",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-e50554",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190313Z-b56c50",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-9e0bf7",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-3baea7",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-5c1269",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-e4564d",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-3db607",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190313Z-b42fc2",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-00c831",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190313Z-284f4a",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-db6b69",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190313Z-f4d2da",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190313Z-1d0cfb",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190313Z-747b08",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190313Z-d1019e",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190313Z-f47b49",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-de24d1",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        