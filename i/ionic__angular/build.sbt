organization := "org.scalablytyped"
name := "ionic__angular"
version := "4.11.5-f9041d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__common" % "8.2.14-cca04d",
  "org.scalablytyped" %%% "angular__compiler" % "8.2.14-4e53a5",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-c10ed9",
  "org.scalablytyped" %%% "angular__forms" % "8.2.14-452cd6",
  "org.scalablytyped" %%% "angular__router" % "8.2.14-79be3c",
  "org.scalablytyped" %%% "inquirer" % "6.5-dt-20190731Z-a97355",
  "org.scalablytyped" %%% "ionic__core" % "4.11.5-fc78ff",
  "org.scalablytyped" %%% "ionicons" % "4.6.3-80b252",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-33032f",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.3-99e1b6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-dc1a2d",
  "org.scalablytyped" %%% "typescript" % "3.7.2-cef6ee")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        